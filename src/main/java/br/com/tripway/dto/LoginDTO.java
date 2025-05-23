package br.com.tripway.dto;

public class LoginDTO {

    private String email;
    private String senha;
    private String CPF;

    public LoginDTO(String email, String senha, String CPF) {
        this.email = email;
        this.senha = senha;
        this.CPF = CPF;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
