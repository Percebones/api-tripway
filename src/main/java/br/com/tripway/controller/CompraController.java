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
import br.com.tripway.exeptions.CompraExeptions;
import br.com.tripway.model.Compra;
import br.com.tripway.service.ServiceCompra;

@RestController
@RequestMapping(path = "/compra")
public class CompraController {

	@Autowired
	private ServiceCompra serviceCompra;

	@PostMapping(path = "/adicionar")
	public ResponseEntity<?> adicionarCompra(@RequestBody Compra compra) {
		try {
			serviceCompra.cadastroCompra(compra);
			return new ResponseEntity<>("Compra criada com sucesso",HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao criar Compra" + e.getMessage(),HttpStatus.BAD_REQUEST);

		}
	}

	@DeleteMapping
	public ResponseEntity<String> deleteCompra(@RequestBody Compra compra) {
		try {
			serviceCompra.deleteCompra(compra);
			return new ResponseEntity<>("Compra deletada com sucesso", HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao deletar compra: " + e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping
	public Iterable<Compra> getAllCompra() {
		return serviceCompra.getAllCompras();
	}

}
