package br.com.tripway.service;

import br.com.tripway.model.Compra;
import br.com.tripway.repository.CompraREPO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceCompra {

    private final CompraREPO compraREPO;

    public ServiceCompra(CompraREPO compraREPO) {
        this.compraREPO = compraREPO;
    }


    public Compra cadastroCompra(Compra compra) {
        return compraREPO.save(compra);
    }

    public void deleteCompra(Compra compra) {
        compraREPO.delete(compra);
    }

    public Iterable<Compra> getAllCompras() {
        return compraREPO.findAll();
    }

    public Optional<Compra> getCompraPorId(Long id) {
        return compraREPO.findById(id);
    }

}
