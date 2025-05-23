package br.com.tripway.controller;

import br.com.tripway.dto.LoginDTO;
import br.com.tripway.model.Cliente;
import br.com.tripway.service.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    @Autowired
    private ServiceLogin loginService;

    @PostMapping(path = "/logar")
    public ResponseEntity<Cliente> login(@RequestBody LoginDTO loginDTO) {
        Optional<Cliente> loginOpt = loginService.login(loginDTO);
        if (loginOpt.isPresent()) {
            return ResponseEntity.ok(loginOpt.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }


}
