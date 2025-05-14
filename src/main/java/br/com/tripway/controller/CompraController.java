package br.com.tripway.controller;

import br.com.tripway.model.Compra;
import br.com.tripway.service.ServiceCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/compra")
public class CompraController {

    @Autowired
    private ServiceCompra serviceCompra;

    @PostMapping(path = "/adicionar")
    public ResponseEntity<?> adicionarCompra(@RequestBody Compra compra) {
        try {
            serviceCompra.cadastroCompra(compra);
            return new ResponseEntity<>("Compra criada com sucesso", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao criar Compra" + e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping(path = "/deletar")
    public ResponseEntity<String> deleteCompra(@RequestBody Compra compra) {
        try {
            serviceCompra.deleteCompra(compra);
            return new ResponseEntity<>("Compra deletada com sucesso", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao deletar compra: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/puxarPorId/{id}")
    public Optional<Compra> getCompraPorID(@PathVariable Long id) {
        return serviceCompra.getCompraPorId(id);
    }

    @GetMapping(path = "/puxarTudo")
    public Iterable<Compra> getAllCompra() {
        return serviceCompra.getAllCompras();
    }

}
