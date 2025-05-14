package br.com.tripway.service;

import br.com.tripway.exeptions.PacoteExeptions;
import br.com.tripway.model.Pacote;
import br.com.tripway.repository.PacoteREPO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class ServicePacote {

    private PacoteREPO pacoteREPO;

    public ServicePacote(PacoteREPO pacoteREPO) {
        this.pacoteREPO = pacoteREPO;
    }

    public Pacote criarPacote(String nome_pacote, BigDecimal preco, LocalDate data_partida, LocalDate data_volta,
                              String destino, String descricao, LocalDate checkIn, int qtd_dias, Blob imagem_pacote)
            throws PacoteExeptions {

        Pacote pacote = new Pacote(nome_pacote, preco, data_partida, data_volta, destino, descricao, checkIn, qtd_dias,
                imagem_pacote);
        return cadastroPacote(pacote);
    }

    public void deletePacote(Pacote pacote) {
        pacoteREPO.delete(pacote);
    }

    public Pacote cadastroPacote(Pacote pacote) throws PacoteExeptions {
        if (pacote.getData_partida().isAfter(pacote.getData_volta())) {
            throw new PacoteExeptions("Data de partida precisa ser antes da data da volta");
        }
        if (pacote.getPreco().compareTo(BigDecimal.ZERO) < 0 || pacote.getPreco() == null) {
            throw new PacoteExeptions("Preco do pacote nao pode ser negativo");
        }
        if (pacote.getDestino() == null || pacote.getDestino().isEmpty()) {
            throw new PacoteExeptions("O destino não pode ser vazio.");
        }
        try {
            return pacoteREPO.save(pacote);
        } catch (Exception e) {
            throw new PacoteExeptions("Tipo de dado invalido ou fora de ordem");
        }
    }

    public Iterable<Pacote> getAllClientes() {
        return pacoteREPO.findAll();
    }

    public Optional<Pacote> getPacotePorId(Long id) {
        return pacoteREPO.findById(id);
    }

    public Iterable<Pacote> getAllPacote() {
        return pacoteREPO.findAll();
    }

}
