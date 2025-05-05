package model;

public class Venda {
	private int id_venda;
	private float total_pago;
	private int qtd_pessoa;
	private char tipo_pagamento;

	public Venda(int id_venda, float total_pago, int qtd_pessoa, char tipo_pagamento) {
		super();
		this.id_venda = id_venda;
		this.total_pago = total_pago;
		this.qtd_pessoa = qtd_pessoa;
		this.tipo_pagamento = tipo_pagamento;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public float getTotal_pago() {
		return total_pago;
	}

	public void setTotal_pago(float total_pago) {
		this.total_pago = total_pago;
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

}
