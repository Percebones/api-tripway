package dao;

import model.Cliente;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ClienteDAO extends DAOGenerico<Cliente> {

	@Override
	public Class<Cliente> getEntityClass() {
		return Cliente.class;
	}

	@Override
	protected Object getId(Cliente cliente) {
		return cliente.getId_cliente();
	}

}
