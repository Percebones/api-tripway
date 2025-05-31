package br.com.tripway.repository;

import br.com.tripway.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteREPO extends REPOGenerico<Cliente> {


    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);

    Optional<Cliente> findAllById(Long id);


}
