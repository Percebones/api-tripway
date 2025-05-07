package model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Pacote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pacote;
	@Column
	private String nome_pacote;
	@Column
	private float preco;
	@Column
	private Date data;
	@Column
	private String destino;
	@Column
	private String descricao;
	@Column
	private Date checkIn;
	@Column
	private int qtd_dias;

	public Pacote(int id_pacote, String nome_pacote, float preco, Date data, String destino, String descricao,
			Date checkIn, int qtd_dias) {
		super();
		this.id_pacote = id_pacote;
		this.nome_pacote = nome_pacote;
		this.preco = preco;
		this.data = data;
		this.destino = destino;
		this.descricao = descricao;
		this.checkIn = checkIn;
		this.qtd_dias = qtd_dias;
	}

	public int getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote(int id_pacote) {
		this.id_pacote = id_pacote;
	}

	public String getNome_pacote() {
		return nome_pacote;
	}

	public void setNome_pacote(String nome_pacote) {
		this.nome_pacote = nome_pacote;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public int getQtd_dias() {
		return qtd_dias;
	}

	public void setQtd_dias(int qtd_dias) {
		this.qtd_dias = qtd_dias;
	}

}
