package dao;

import model.Pacote;

public class PacoteDAO extends DAOGenerico<Pacote> {

	@Override
	public Class<Pacote> getEntityClass() {
		return Pacote.class;
	}

	@Override
	protected Object getId(Pacote pacote) {
		return pacote.getId_pacote();
	}

}
