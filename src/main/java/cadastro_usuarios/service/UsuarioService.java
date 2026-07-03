package cadastro_usuarios.service;

import cadastro_usuarios.model.Usuario;
import cadastro_usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {

        Optional<Usuario> usuarioExistente = repository.findById(id);

        if (usuarioExistente.isPresent()) {

            Usuario usuario = usuarioExistente.get();

            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setIdade(usuarioAtualizado.getIdade());

            return repository.save(usuario);
        }

        return null;
    }
    public boolean excluir(Long id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}