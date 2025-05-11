package repository;

import model.Cliente;

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
