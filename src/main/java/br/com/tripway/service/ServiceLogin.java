package br.com.tripway.service;

import br.com.tripway.dto.LoginDTO;
import br.com.tripway.model.Cliente;
import br.com.tripway.repository.LoginREPO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceLogin {

    private final LoginREPO loginREPO;

    public ServiceLogin(LoginREPO loginREPO) {
        this.loginREPO = loginREPO;
    }

    public Optional<Cliente> login(String email, String pass) {
        return loginREPO.findByEmailAndSenha(email, pass);
    }
}
