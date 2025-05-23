package br.com.tripway.repository;

import br.com.tripway.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginREPO extends REPOGenerico<Cliente> {

    Optional<Cliente> findByEmailAndSenha(String email, String senha);

    Optional<Cliente> findByCpfAndSenha(String CPF, String senha);


}
