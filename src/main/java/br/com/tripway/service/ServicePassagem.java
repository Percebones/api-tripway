package br.com.tripway.service;

import br.com.tripway.model.Passagem;
import br.com.tripway.repository.PassagemREPO;
import org.springframework.stereotype.Service;

@Service
public class ServicePassagem {

    private final PassagemREPO passagemREPO;

    public ServicePassagem(PassagemREPO passagemREPO) {
        this.passagemREPO = passagemREPO;
    }

    public Passagem emitePassagem(Passagem passagemDTO) {
        try {
            Passagem passagem = new Passagem();
            passagem.setSaidaIda(passagemDTO.getSaidaIda());
            passagem.setChegadaIda(passagemDTO.getChegadaIda());
            passagem.setClasse(passagemDTO.getClasse());
            passagem.setChegadaVolta(passagemDTO.getChegadaVolta());
            passagem.setSaidaVolta(passagemDTO.getSaidaVolta());
            passagem.setCompanhiaAerea(passagemDTO.getCompanhiaAerea());
            return passagemREPO.save(passagem);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
