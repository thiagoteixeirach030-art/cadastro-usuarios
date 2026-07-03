# Cadastro de Usuários - API REST

## Descrição

Projeto da disciplina Desenvolvimento Web-Thiago Borges Teixeira.

O projeto é uma API REST utilizando Spring Boot para realizar o cadastro de usuários.

---

## Tecnologias utilizadas
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Banco H2
- Maven

---

## Estrutura do projeto
```
controller
service
repository
model
exception
```

---

## Como executar

1. Clonar o projeto

```
git clone https://github.com/SEU-USUARIO/cadastro-usuarios.git
```

2. Abrir no IntelliJ

3. Executar:

```
CadastroUsuariosApplication
```

Acessar o projeto em:

```
http://localhost:8080
```

---

## Console H2

```
http://localhost:8080/h2-console
```

JDBC URL

```
jdbc:h2:mem:cadastrodb
```

Usuário

```
sa
```

Senha

```
(Nada)
```

---

## Endpoints

### Listar usuários

GET

```
/usuarios
```

---

### Buscar usuário

GET

```
/usuarios/{id}
```

---

### Criar usuário

POST

```
/usuarios
```

Body

```json
{
    "nome":"Thiago",
    "email":"Thiago@email.com",
    "idade":21
}
```

---

### Atualizar usuário

PUT

```
/usuarios/{id}
```

---

### Excluir usuário

DELETE

```
/usuarios/{id}
```

---

By Thiago Borges Teixeira
