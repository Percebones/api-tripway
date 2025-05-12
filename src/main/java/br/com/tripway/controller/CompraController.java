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

import br.com.tripway.model.Compra;
import br.com.tripway.service.ServiceCompra;

@Controller
@RequestMapping(path = "/compra")
public class CompraController {

	@Autowired
	private ServiceCompra serviceCompra;

	@PostMapping
	public ResponseEntity<?> adicionarCompra(@RequestBody Compra compra) {
		try {
			serviceCompra.cadastroCompra(compra);
			return ResponseEntity.ok(HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro ao criar Compra" + e.getMessage());

		}
	}

	@DeleteMapping
	public void deleteCompra(@RequestBody Compra compra) {
		serviceCompra.deleteCompra(compra);
	}

	@GetMapping
	public @ResponseBody Iterable<Compra> getAllCompra() {
		return serviceCompra.getAllCompras();
	}

}
