package br.com.tripway.model;

import br.com.tripway.dto.ClienteDTO;
import jakarta.persistence.*;

import java.sql.Blob;


@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = true)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(length = 15, nullable = true)
    private String phone;

    @Column(length = 1, nullable = true)
    private char sexo;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 32, nullable = false)
    private String senha;
    @Lob
    @Column(name = "imagem_usuario", nullable = true)
    private Blob imagem_usuario;

    public Cliente() {
    }

    public Cliente(ClienteDTO clienteDTO) {
        super();
        this.cpf = clienteDTO.getCpf();
        this.nome = clienteDTO.getNome();
        this.phone = clienteDTO.getTelefone();
        this.sexo = clienteDTO.getSexo();
        this.email = clienteDTO.getEmail();
        this.senha = clienteDTO.getSenha();
    }

    public Long getId() {
        return id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
