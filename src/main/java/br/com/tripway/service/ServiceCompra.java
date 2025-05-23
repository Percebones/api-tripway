package br.com.tripway.service;

import br.com.tripway.model.Compra;
import br.com.tripway.model.Pacote;
import br.com.tripway.repository.CompraREPO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceCompra {

    private final CompraREPO compraREPO;

    public ServiceCompra(CompraREPO compraREPO) {
        this.compraREPO = compraREPO;
    }

    public List<Pacote> pacotesDoCliente(Long id){
        List<Compra> compras = compraREPO.findByClienteId(id);
        return compras.stream().map(Compra::getPacote).collect(Collectors.toList());
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
