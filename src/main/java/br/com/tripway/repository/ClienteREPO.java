package br.com.tripway.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.tripway.model.Cliente;

@Repository
public interface ClienteREPO extends REPOGenerico<Cliente> {

	
	
	
	Optional<Cliente> findById(int id);

	boolean existsByCpf(String cpf);
}
