package dao;

import model.Cliente;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ClienteDAO implements DAO<Cliente> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Class<Cliente> getEntityClass() {
		return Cliente.class;
	}

	@Override
	public void save(Cliente cliente) {
		if (cliente.getId_cliente() == 0) {
			entityManager.persist(cliente);
		} else {
			entityManager.merge(cliente);
		}
	}

	@Override
	public void update(Cliente cliente) {
		entityManager.merge(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		Cliente clienteToRemove = entityManager.find(Cliente.class, cliente.getId_cliente());
		if (clienteToRemove != null) {
			entityManager.remove(clienteToRemove);
		}

	}

	@Override
	public Optional<Cliente> findById(Object id) {
		Cliente cliente = entityManager.find(Cliente.class, id);
		return Optional.ofNullable(cliente);
	}

}
