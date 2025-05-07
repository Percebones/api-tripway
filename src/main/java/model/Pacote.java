package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacote")
public class Pacote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pacote;

	@Column(name = "nome_pacote", nullable = false, length = 120)
	private String nome_pacote;

	@Column(nullable = false)
	private float preco;

	@Column(name = "data_partida", nullable = false)
	private LocalDate data_partida;

	@Column(name = "data_volta", nullable = false)
	private LocalDate data_volta;

	@Column(nullable = false)
	private String destino;

	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private LocalDate checkIn;

	@Column(name = "qtd_dias", nullable = false)
	private int qtd_dias;

	public Pacote() {
	}

	public Pacote(int id_pacote, String nome_pacote, float preco, LocalDate data_partida, LocalDate data_volta,
			String destino, String descricao, LocalDate checkIn, int qtd_dias) {
		super();
		this.id_pacote = id_pacote;
		this.nome_pacote = nome_pacote;
		this.preco = preco;
		this.data_partida = data_partida;
		this.data_volta = data_volta;
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

	public LocalDate getData_partida() {
		return data_partida;
	}

	public void setData_partida(LocalDate data_partida) {
		this.data_partida = data_partida;
	}

	public LocalDate getData_volta() {
		return data_volta;
	}

	public void setData_volta(LocalDate data_volta) {
		this.data_volta = data_volta;
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

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public int getQtd_dias() {
		return qtd_dias;
	}

	public void setQtd_dias(int qtd_dias) {
		this.qtd_dias = qtd_dias;
	}

}
