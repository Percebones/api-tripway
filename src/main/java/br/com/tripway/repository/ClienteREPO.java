package br.com.tripway.repository;

import br.com.tripway.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteREPO extends REPOGenerico<Cliente> {


    boolean existsByCpf(String cpf);

    Optional<Cliente> findAllById(Long id);
}
