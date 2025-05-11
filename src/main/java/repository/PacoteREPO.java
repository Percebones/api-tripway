package repository;

import org.springframework.stereotype.Repository;

import model.Pacote;
@Repository
public class PacoteREPO extends REPOGenerico<Pacote> {

	@Override
	public Class<Pacote> getEntityClass() {
		return Pacote.class;
	}

	@Override
	protected Object getId(Pacote pacote) {
		return pacote.getId_pacote();
	}
	
	

}
