package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cliente;
import model.Compra;
import model.Pacote;
import model.TipoPagamento;
import repository.CompraREPO;

@Service
public class ServiceCompra {

	@Autowired
	private CompraREPO compraREPO;

	public Compra efetuarCompra(int qtd_pessoa, TipoPagamento tipo_pagamento, float total_pago, Cliente cliente,
			Pacote pacote) {
		Compra compra = new Compra(qtd_pessoa, tipo_pagamento, total_pago, cliente, pacote);
		return cadastroCompra(compra);
	}

	public Compra cadastroCompra(Compra compra) {
		compraREPO.save(compra);
		return compra;
	}

	public void deleteCompra(Compra compra) {
		compraREPO.delete(compra);
	}

	public Optional<Compra> getById(int id) {
		return compraREPO.findById(id);
	}

}
