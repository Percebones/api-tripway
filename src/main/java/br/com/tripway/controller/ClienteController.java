package br.com.tripway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.tripway.exeptions.ClienteExeptions;
import br.com.tripway.model.Cliente;
import br.com.tripway.service.ServiceCliente;

@Controller
@RequestMapping(path = "/cliente")
public class ClienteController {

	@Autowired
	private ServiceCliente serviceCliente;

	@PostMapping(path = "/adicionar")
	public ResponseEntity<?> adicionarCliente(@RequestBody Cliente cliente) throws Exception {
		try {
			serviceCliente.criarCliente(cliente.getData_nascimento(), cliente.getCpf(), cliente.getNome(),
					cliente.getPhone(), cliente.getSexo(), cliente.getEmail());
			return ResponseEntity.ok(HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro ao criar cliente" + e.getMessage());
		}
	}

	@DeleteMapping
	public void deleteCliente(@RequestBody Cliente cliente) throws ClienteExeptions {
		serviceCliente.deleteCliente(cliente);

	}

	@GetMapping
	public @ResponseBody Iterable<Cliente> getAllCliente() {
		return serviceCliente.getAllClientes();

	}

}
