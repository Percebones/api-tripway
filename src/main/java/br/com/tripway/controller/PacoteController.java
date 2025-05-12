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
import br.com.tripway.model.Pacote;
import br.com.tripway.service.ServicePacote;

@Controller
@RequestMapping(path = "/pacote")
public class PacoteController {

	@Autowired
	private ServicePacote servicePacote;

	@PostMapping
	public ResponseEntity<?> adicionarPacote(@RequestBody Pacote pacote) {
		try {
			servicePacote.cadastroPacote(pacote);
			return ResponseEntity.ok(HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Erro ao criar Pacote" + e.getMessage());

		}
	}

	@DeleteMapping
	public void deletePacote(@RequestBody Pacote pacote) {
		servicePacote.deletePacote(pacote);
	}

	@GetMapping
	public @ResponseBody Iterable<Pacote> getAllCompra() {
		return servicePacote.getAllPacote();
	}

}
