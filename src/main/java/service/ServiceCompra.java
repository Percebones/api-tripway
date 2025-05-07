package service;

import dao.CompraDAO;
import model.Compra;

public abstract class ServiceCompra extends CompraDAO {

	void cadastroCompra(Compra compra) {
		save(compra);
	}

	void updateCompra(Compra compra) {
		update(compra);
	}

	void deleteCompra(Compra compra) {
		delete(compra);
	}

	void gteById(Compra compra) {
		findById(compra);
	}

}
