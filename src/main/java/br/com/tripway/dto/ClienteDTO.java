package br.com.tripway.dto;

import java.sql.Blob;

public class ClienteDTO {

    private Long id;
    private String cpf;
    private String nome;
    private String telefone;
    private char sexo;
    private String email;
    private String senha;
    private Blob imagem_usuario;

    public ClienteDTO(Long id, String cpf, String nome, String phone, char sexo, String email, String senha, Blob imagem_usuario) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = phone;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.imagem_usuario = imagem_usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Blob getImagem_usuario() {
        return imagem_usuario;
    }

    public void setImagem_usuario(Blob imagem_usuario) {
        this.imagem_usuario = imagem_usuario;
    }
}
