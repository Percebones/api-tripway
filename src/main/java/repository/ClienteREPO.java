package repository;

import org.springframework.stereotype.Repository;

import model.Cliente;
@Repository
public class ClienteREPO extends REPOGenerico<Cliente> {

	@Override
	public Class<Cliente> getEntityClass() {
		return Cliente.class;
	}

	@Override
	protected Object getId(Cliente cliente) {
		return cliente.getId_cliente();
	}

}
