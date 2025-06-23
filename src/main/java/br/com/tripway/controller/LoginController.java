package br.com.tripway.controller;

import br.com.tripway.model.Cliente;
import br.com.tripway.responses.ErrorResponse;
import br.com.tripway.responses.SuccessResponse;
import br.com.tripway.service.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

    @Autowired
    private ServiceLogin loginService;

    @GetMapping()
    public ResponseEntity<Object> login(@RequestParam("email") String email, @RequestParam("pass") String pass) {
        Optional<Cliente> cliente = loginService.login(email, pass);

        if(cliente.isPresent()) {
            return SuccessResponse.success200(cliente);
        }

        return ErrorResponse.error400("Email ou senha incorretos!");
    }

}
