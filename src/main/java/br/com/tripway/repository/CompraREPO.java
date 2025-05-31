package br.com.tripway.repository;

import br.com.tripway.model.Compra;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraREPO extends REPOGenerico<Compra> {

    List<Compra> findByClienteId(Long id);

}



