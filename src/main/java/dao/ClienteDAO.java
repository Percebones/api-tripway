package dao;

import model.Cliente;

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
