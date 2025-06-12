package br.com.tripway.controller;

import br.com.tripway.dto.PacoteDTO;
import br.com.tripway.enums.Regioes;
import br.com.tripway.model.Pacote;
import br.com.tripway.service.ServicePacote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pacote")
public class PacoteController {

    @Autowired
    private ServicePacote servicePacote;

    @PostMapping(path = "/adicionar")
    public ResponseEntity<?> adicionarPacote(@RequestBody PacoteDTO pacoteDTO) {
        try {
            Pacote pacote = new Pacote(pacoteDTO);
            servicePacote.cadastroPacote(pacote);
            return new ResponseEntity<>("Pacote criado com sucesso", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao criar Pacote" + e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping(path = "/deletar")
    public ResponseEntity<String> deletePacote(@RequestBody PacoteDTO pacoteDTO) {
        try {
            Pacote pacote = new Pacote(pacoteDTO);
            servicePacote.deletePacote(pacote);
            return new ResponseEntity<>("Pacote deletado com sucesso", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao deletar Pacote: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/puxarPorNome")
    public Optional<Pacote> getPorNome(@RequestParam String nome) {
        return servicePacote.getPacotePorNome(nome);
    }

    @GetMapping(path = "/puxarPorAvaliacao")
    public Optional<Pacote> getPorAvaliacao(@RequestParam int avaliacao) {
        return servicePacote.getPacotePorAvaliacao(avaliacao);
    }

    @GetMapping(path = "/puxarPorPreco")
    public Optional<Pacote> getPorPreco(@RequestParam BigDecimal preco) {
        return servicePacote.getPacotePorPreco(preco);
    }

    @GetMapping(path = "/puxarPorRangePreco")
    public List<Pacote> getPorPrecoRange(@RequestParam BigDecimal min, @RequestParam BigDecimal max){
        return servicePacote.getPacotePrecoPorRange(min,max);
    }

    @GetMapping(path = "/puxarPorRegiao")
    public Optional<Pacote> getPorRegiao(@RequestParam Regioes regiao) {
        return servicePacote.getPacotePorRegiao(regiao);
    }

    @GetMapping(path = "/puxarTudo")
    public Iterable<Pacote> getAllCompra() {
        return servicePacote.getAllPacote();
    }

}
