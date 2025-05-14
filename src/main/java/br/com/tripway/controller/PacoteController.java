package br.com.tripway.controller;

import br.com.tripway.model.Pacote;
import br.com.tripway.service.ServicePacote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pacote")
public class PacoteController {

    @Autowired
    private ServicePacote servicePacote;

    @PostMapping(path = "/adicionar")
    public ResponseEntity<?> adicionarPacote(@RequestBody Pacote pacote) {
        try {
            servicePacote.cadastroPacote(pacote);
            return new ResponseEntity<>("Pacote criado com sucesso", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao criar Pacote" + e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping(path = "/deletar")
    public ResponseEntity<String> deletePacote(@RequestBody Pacote pacote) {
        try {
            servicePacote.deletePacote(pacote);
            return new ResponseEntity<>("Pacote deletado com sucesso", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao deletar Pacote: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/puxarTudo")
    public Iterable<Pacote> getAllCompra() {
        return servicePacote.getAllPacote();
    }

}
