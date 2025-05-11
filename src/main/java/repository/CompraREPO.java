package repository;

import org.springframework.stereotype.Repository;

import model.Compra;
@Repository
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
