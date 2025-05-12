package service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.tokens.Token.ID;

import model.Cliente;
import model.Compra;
import repository.ClienteREPO;

@Service
public class ServiceCliente {

	@Autowired
	private ClienteREPO clienteRepo;

	public Cliente criarCliente(LocalDate data_nascimento, String cpf, String nome, String phone, char sexo,
			String email) throws Exception {
		Cliente cliente = new Cliente(data_nascimento, cpf, nome, phone, sexo, email);
		return cadastroCliente(cliente);

	}

	public Cliente cadastroCliente(Cliente cliente) throws Exception {
		if (clienteRepo.existsByCpf(cliente.getCpf())) {
			throw new Exception("Cliente com CPF já cadastrado.");
		}
		return clienteRepo.save(cliente);
	}

	public void deleteCliente(Cliente cliente) {
		clienteRepo.delete(cliente);
	}

	public Iterable<Cliente> getAllClientes() {
		return clienteRepo.findAll();
	}

	public Optional<Cliente> getClientePorId(ID id) {
		return clienteRepo.findById(id);
	}
}
