package repository;

import model.Compra;

public class CompraREPO extends REPOGenerico<Compra> {

	@Override
	public Class<Compra> getEntityClass() {
		return Compra.class;
	}

	@Override
	protected Object getId(Compra compra) {
		return compra.getId_compra();
	}

}
