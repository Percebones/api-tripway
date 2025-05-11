package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;

	@Column(name = "data_nascimento", nullable = false)
	private LocalDate data_nascimento;

	@Column(unique = true, nullable = false)
	private String cpf;

	@Column(nullable = false)
	private String nome;

	@Column(length = 15, nullable = false)
	private String phone;

	@Column(length = 1, nullable = false)
	private char sexo;

	@Column(length = 100, nullable = false)
	private String email;

	public Cliente() {
	}

	public Cliente(LocalDate data_nascimento, String cpf, String nome, String phone, char sexo, String email) {
		super();
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

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
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

}
