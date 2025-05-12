package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Cliente;
import service.ServiceCliente;

@Controller
@RequestMapping(path = "/cliente")
public class ClienteControler {

	@Autowired
	private ServiceCliente serviceCliente;

	@PostMapping(path = "/adicionar")
	public ResponseEntity<?> criarCliente(@RequestBody Cliente cliente) throws Exception {
		try {
			Cliente clienteNovo = serviceCliente.criarCliente(cliente.getData_nascimento(), cliente.getCpf(),
					cliente.getNome(), cliente.getPhone(), cliente.getSexo(), cliente.getEmail());
			return ResponseEntity.ok(HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro ao criar cliente" + e.getMessage());
		}
	}

	@GetMapping
	public @ResponseBody Iterable<Cliente> getAllCliente() {
		return serviceCliente.getAllClientes();

	}

}
