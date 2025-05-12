package br.com.tripway.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.tripway.model.Pacote;

@Repository
public interface PacoteREPO extends REPOGenerico<Pacote> {

	Optional<Pacote> findById(int id);
	
	
		
	
	
	
}
