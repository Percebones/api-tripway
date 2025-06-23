package br.com.tripway.service;

import br.com.tripway.enums.Regioes;
import br.com.tripway.exeptions.PacoteExeptions;
import br.com.tripway.model.Pacote;
import br.com.tripway.repository.PacoteREPO;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServicePacote {

    private PacoteREPO pacoteREPO;

    public ServicePacote(PacoteREPO pacoteREPO) {
        this.pacoteREPO = pacoteREPO;
    }

    public void deletePacote(Pacote pacote) {
        pacoteREPO.delete(pacote);
    }

    public Pacote cadastroPacote(Pacote pacote) throws PacoteExeptions {

        if (pacote.getData_partida().isAfter(pacote.getData_volta())) {
            throw new PacoteExeptions(" Data de partida precisa ser antes da data da volta");
        }
        if (pacote.getPreco().compareTo(BigDecimal.ZERO) < 0 || pacote.getPreco() == null) {
            throw new PacoteExeptions(" Preco do pacote nao pode ser negativo");
        }
        if (pacote.getDestino() == null || pacote.getDestino().isEmpty()) {
            throw new PacoteExeptions(" O destino não pode ser vazio.");
        }
        try {
            return pacoteREPO.save(pacote);
        } catch (Exception e) {
            throw new PacoteExeptions(" Tipo de dado invalido ou fora de ordem");
        }
    }

    public Iterable<Pacote> getAllClientes() {
        return pacoteREPO.findAll();
    }

    public Optional<Pacote> getPacotePorNome(String nome) {
        return pacoteREPO.findByNomePacote(nome);
    }

    public Optional<Pacote> getPacotePorRegiao(Regioes regiao) {
        return pacoteREPO.findByRegiao(regiao);
    }

    public Optional<Pacote> getPacotePorId(Long id) {
        return pacoteREPO.findById(id);
    }

    public Optional<Pacote> getPacotePorPreco(BigDecimal preco) {
        return pacoteREPO.findByPreco(preco);
    }

    public List<Pacote> getPacotePrecoPorRange(BigDecimal min, BigDecimal max) {
        return pacoteREPO.findByPrecoBetween(min, max);
    }

    public Optional<Pacote> getPacotePorAvaliacao(int avalicao) {
        return pacoteREPO.findByAvaliacao(avalicao);
    }

    public Iterable<Pacote> getAllPacote() {
        return pacoteREPO.findAll();
    }

}
