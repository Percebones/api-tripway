package br.com.tripway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tripway.exeptions.ClienteExeptions;
import br.com.tripway.model.Cliente;
import br.com.tripway.service.ServiceCliente;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

	@Autowired
	private ServiceCliente serviceCliente;

	@PostMapping(path = "/adicionar")
	public ResponseEntity<?> adicionarCliente(@RequestBody Cliente cliente) throws Exception {
		try {
			serviceCliente.criarCliente(cliente.getData_nascimento(), cliente.getCpf(), cliente.getNome(),
					cliente.getPhone(), cliente.getSexo(), cliente.getEmail());
			return new ResponseEntity<>("Cliente criado com sucesso",HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao criar Cliente" + e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping
	public ResponseEntity<String> deleteCliente(@RequestBody Cliente cliente) throws ClienteExeptions {
		try {
			serviceCliente.deleteCliente(cliente);
			return new ResponseEntity<>("Cliente deletado com sucesso", HttpStatus.NO_CONTENT);
		} catch (ClienteExeptions e) {
			return new ResponseEntity<>("Erro ao deletar Cliente: " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping
	public Iterable<Cliente> getAllCliente() {
		return serviceCliente.getAllClientes();

	}

}
