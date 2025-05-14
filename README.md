# 🌍 TripWay API

API REST desenvolvida com **Spring Boot** para um sistema de **compra de pacotes de viagens**. Essa API permite o
cadastro de clientes, gerenciamento de pacotes turísticos, registro de compras e tipos de pagamento.

---
![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.5-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9.6-blue)

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL
- Maven
- Jakarta Persistence

---

## 🔄 Relacionamentos

- Um **Cliente** pode fazer várias **Compras**.
- Cada **Compra** está associada a um único **Pacote** e um **TipoPagamento**.
- Cada **Pacote** pode ser comprado por vários clientes.
- O **TipoPagamento** é usado para categorizar como o cliente pagou (PIX, Cartão, etc.).

---

## 🚀 Como Executar o Projeto

### 1. Pré-requisitos

- Java 17 instalado
- MySQL rodando
- IDE (Eclipse, IntelliJ, VSCode)
- Maven instalado

### 2. Configurar o `application.properties`

Crie ou edite o arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/tripway
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Rodar a aplicação

Via IDE ou terminal:

---

## 📌 Observações

- O banco de dados será criado automaticamente.
- A aplicação segue os princípios RESTful e boas práticas com Spring Boot.

---

## 👨‍💻 Autor

Thiago Percebon Silva  
Curso de Engenharia de Software – UniBrasil  
Desenvolvido como parte de projeto acadêmico
