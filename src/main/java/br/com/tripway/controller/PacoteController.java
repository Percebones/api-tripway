package br.com.tripway.controller;

import br.com.tripway.dto.PacoteDTO;
import br.com.tripway.enums.Regioes;
import br.com.tripway.model.Hotel;
import br.com.tripway.model.Pacote;
import br.com.tripway.repository.PacoteREPO;
import br.com.tripway.service.ServiceHotel;
import br.com.tripway.service.ServicePacote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pacote")
public class PacoteController {

    @Autowired
    private ServicePacote servicePacote;

    @Autowired
    private ServiceHotel serviceHotel;

    @Autowired
    private PacoteREPO pacoteREPO;

    @GetMapping
    public Iterable<Pacote> getAll() {
        return servicePacote.getAllPacote();
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> adicionarPacote(
            @RequestPart("pacote") PacoteDTO pacoteDTO,
            @RequestPart("imagem") MultipartFile imagem) {

        try {
            Hotel hotel = serviceHotel.emiteHotel(pacoteDTO.getHotel());
            Pacote pacote = new Pacote(pacoteDTO);
            pacote.setHotel(hotel);

            if (imagem != null && !imagem.isEmpty()) {
                pacote.setImagem_pacote(new SerialBlob(imagem.getBytes()));
            }

            servicePacote.cadastroPacote(pacote);
            return new ResponseEntity<>("Pacote criado com sucesso", HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao criar Pacote: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/imagem/{id}")
    public ResponseEntity<byte[]> buscarImagemPorId(@PathVariable Long id) {
        try {
            Optional<Pacote> pacoteOptional = pacoteREPO.findById(id.intValue());

            if (pacoteOptional.isEmpty() || pacoteOptional.get().getImagem_pacote() == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            Pacote pacote = pacoteOptional.get();
            Blob imagemBlob = pacote.getImagem_pacote();
            byte[] imagemBytes = imagemBlob.getBytes(1, (int) imagemBlob.length());

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG); // ou IMAGE_PNG dependendo do formato que você usa
            headers.setContentLength(imagemBytes.length);

            return new ResponseEntity<>(imagemBytes, headers, HttpStatus.OK);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping()
    public ResponseEntity<String> deletePacote(@RequestBody PacoteDTO pacoteDTO) {
        try {
            Pacote pacote = new Pacote(pacoteDTO);
            servicePacote.deletePacote(pacote);
            return new ResponseEntity<>("Pacote deletado com sucesso", HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro ao deletar Pacote: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/byName")
    public Optional<Pacote> getPorNome(@RequestParam String nome) {
        return servicePacote.getPacotePorNome(nome);
    }

    @GetMapping(path = "/byAvaliacao")
    public Optional<Pacote> getPorAvaliacao(@RequestParam int avaliacao) {
        return servicePacote.getPacotePorAvaliacao(avaliacao);
    }

    @GetMapping(path = "/byPreco")
    public Optional<Pacote> getPorPreco(@RequestParam BigDecimal preco) {
        return servicePacote.getPacotePorPreco(preco);
    }

    @GetMapping(path = "/byPrecoRange")
    public List<Pacote> getPorPrecoRange(@RequestParam BigDecimal min, @RequestParam BigDecimal max) {
        return servicePacote.getPacotePrecoPorRange(min, max);
    }

    @GetMapping(path = "/byRegiao")
    public Optional<Pacote> getPorRegiao(@RequestParam Regioes regiao) {
        return servicePacote.getPacotePorRegiao(regiao);
    }

}
