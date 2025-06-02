package br.com.tripway.repository;

import br.com.tripway.enums.Regioes;
import br.com.tripway.model.Pacote;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public interface PacoteREPO extends REPOGenerico<Pacote> {

    Optional<Pacote> findById(int id);

    Optional<Pacote> findByNomePacote(String nome);

    Optional<Pacote> findByRegiao(Regioes regiao);

    Optional<Pacote> findByAvaliacao(int avaliacao);

    Optional<Pacote> findByPreco(BigDecimal preco);

    Optional<Pacote> findByPrecoBetween(BigDecimal min, BigDecimal max);


}
