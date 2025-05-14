package br.com.tripway.service;

import br.com.tripway.exeptions.ClienteExeptions;
import br.com.tripway.model.Cliente;
import br.com.tripway.repository.ClienteREPO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceCliente {

    private final ClienteREPO clienteRepo;

    public ServiceCliente(ClienteREPO clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public Cliente cadastroCliente(Cliente cliente) throws ClienteExeptions {
        if (clienteRepo.existsByCpf(cliente.getCpf())) {
            throw new ClienteExeptions("Cliente com CPF já cadastrado.");
        }
        try {
            return clienteRepo.save(cliente);
        } catch (Exception e) {
            throw new ClienteExeptions("Tipo de dado invalido ou fora de ordem");

        }
    }

    public void deleteCliente(Cliente cliente) throws ClienteExeptions {
        if (clienteRepo.existsByCpf(cliente.getCpf())) {
            clienteRepo.delete(cliente);
        } else {
            throw new ClienteExeptions("Cliente Não encontrado");
        }
    }

    public Iterable<Cliente> getAllClientes() {
        return clienteRepo.findAll();
    }

    public Optional<Cliente> getClientePorId(Long id) {
        return clienteRepo.findAllById(id);
    }
}
