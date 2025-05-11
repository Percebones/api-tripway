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

	@Column(name = "id_cliente", nullable = false)
	private int id_cliente;

	@Column(name = "id_pacote", nullable = false)
	private int id_pacote;

	public Compra() {
	}

	public Compra(int qtd_pessoa, TipoPagamento tipo_pagamento, float total_pago, int id_cliente, int id_pacote) {
		super();
		this.qtd_pessoa = qtd_pessoa;
		this.tipo_pagamento = tipo_pagamento;
		this.total_pago = total_pago;
		this.id_cliente = id_cliente;
		this.id_pacote = id_pacote;
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

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote(int id_pacote) {
		this.id_pacote = id_pacote;
	}

	
	

}
