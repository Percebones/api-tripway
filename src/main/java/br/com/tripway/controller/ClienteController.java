package br.com.tripway.controller;

import br.com.tripway.exeptions.ClienteExeptions;
import br.com.tripway.model.Cliente;
import br.com.tripway.service.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private ServiceCliente serviceCliente;

    @PostMapping(path = "/adicionar")
    public ResponseEntity<?> adicionarCliente(@RequestBody Cliente cliente) throws Exception {
        try {
            serviceCliente.cadastroCliente(cliente);
            return new ResponseEntity<>("Cliente criado com sucesso", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao criar Cliente" + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "/deletar")
    public ResponseEntity<String> deleteCliente(@RequestBody Cliente cliente) throws ClienteExeptions {
        try {
            serviceCliente.deleteCliente(cliente);
            return new ResponseEntity<>("Cliente deletado com sucesso", HttpStatus.NO_CONTENT);
        } catch (ClienteExeptions e) {
            return new ResponseEntity<>("Erro ao deletar Cliente: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(path = "/puxarPorId/{id}")
    public Optional<Cliente> getClientePorID(@PathVariable Long id) {
        return serviceCliente.getClientePorId(id);
    }

    @GetMapping(path = "/puxarTudo")
    public Iterable<Cliente> getAllCliente() {
        return serviceCliente.getAllClientes();
    }

}
