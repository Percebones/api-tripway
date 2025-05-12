package service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import model.Cliente;
import model.Compra;
import model.Pacote;
import model.TipoPagamento;
import repository.CompraREPO;

@Service
public class ServiceCompra {

	private final CompraREPO compraREPO;

	public ServiceCompra(CompraREPO compraREPO) {
		this.compraREPO = compraREPO;
	}

	public Compra efetuarCompra(int qtd_pessoa, TipoPagamento tipo_pagamento, float total_pago, Cliente cliente,
			Pacote pacote) {
		Compra compra = new Compra(qtd_pessoa, tipo_pagamento, total_pago, cliente, pacote);
		return cadastroCompra(compra);
	}

	public Compra cadastroCompra(Compra compra) {
		return compraREPO.save(compra);
	}

	public void deleteCompra(Compra compra) {
		compraREPO.delete(compra);
	}

	public Iterable<Compra> getAllCompras() {
		return compraREPO.findAll();
	}

	public Optional<Compra> getCompraPorId(Long id) {
		return compraREPO.findById(id);
	}

}
