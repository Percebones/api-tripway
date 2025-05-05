package model;

import java.sql.Date;

public class Cliente {
private int id_cliente;
private Date data_nascimento;
private int cpf;
private String nome;
private String phone;
private char sexo;
private String email;

public Cliente(int id_cliente, Date data_nascimento, int cpf, String nome, String phone, char sexo, String email) {
	super();
	this.id_cliente = id_cliente;
	this.data_nascimento = data_nascimento;
	this.cpf = cpf;
	this.nome = nome;
	this.phone = phone;
	this.sexo = sexo;
	this.email = email;
}
public int getId_cliente() {
	return id_cliente;
}
public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
}
public Date getData_nascimento() {
	return data_nascimento;
}
public void setData_nascimento(Date data_nascimento) {
	this.data_nascimento = data_nascimento;
}
public int getCpf() {
	return cpf;
}
public void setCpf(int cpf) {
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





}
