package br.com.tripway.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.tripway.model.Cliente;

@Repository
public interface ClienteREPO extends REPOGenerico<Cliente> {



	boolean existsByCpf(String cpf);

    Optional<Cliente> findAllById(Long id);
}
