package model;

public class Compra {
	private int id_compra;
	private int qtd_pessoa;
	private char tipo_pagamento;
	private float total_pago;

	public Compra(int id_compra, int qtd_pessoa, char tipo_pagamento, float total_pago) {
		super();
		this.id_compra = id_compra;
		this.qtd_pessoa = qtd_pessoa;
		this.tipo_pagamento = tipo_pagamento;
		this.total_pago = total_pago;
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

	public char getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(char tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public float getTotal_pago() {
		return total_pago;
	}

	public void setTotal_pago(float total_pago) {
		this.total_pago = total_pago;
	}

}
