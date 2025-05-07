package service;

import model.Cliente;
import dao.ClienteDAO;

public abstract class ServiceCliente extends ClienteDAO {

	void cadastroCliente(Cliente cliente) {
		save(cliente);
	}

	void updateCliente(Cliente cliente) {
		update(cliente);
	}

	void deleteCliente(Cliente cliente) {
		delete(cliente);
	}

	void gteById(Cliente cliente) {
		findById(cliente);
	}
}
