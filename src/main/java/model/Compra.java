package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_compra;

	@Column(nullable = false)
	private int qtd_pessoa;

	@Column(nullable = false)
	private TipoPagamento tipo_pagamento;

	@Column(nullable = false)
	private float total_pago;

	@Column(nullable = false)
	private Cliente cliente;

	@Column(nullable = false)
	private Pacote pacote;

	public Compra() {
	}

	public Compra(int qtd_pessoa, TipoPagamento tipo_pagamento, float total_pago, Cliente cliente,
			Pacote pacote) {
		super();
		this.qtd_pessoa = qtd_pessoa;
		this.tipo_pagamento = tipo_pagamento;
		this.total_pago = total_pago;
		this.cliente = cliente;
		this.pacote = pacote;
	}

	public int getId_compra() {
		return id_compra;
	}

	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}

	public int getQtd_pessoa() {
		return qtd_pessoa;
	}

	public void setQtd_pessoa(int qtd_pessoa) {
		this.qtd_pessoa = qtd_pessoa;
	}

	public TipoPagamento getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(TipoPagamento tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public float getTotal_pago() {
		return total_pago;
	}

	public void setTotal_pago(float total_pago) {
		this.total_pago = total_pago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

}
