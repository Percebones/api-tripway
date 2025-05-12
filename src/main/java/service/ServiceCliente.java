package service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Service;

import exeptions.ClienteExeptions;
import model.Cliente;
import repository.ClienteREPO;

@Service
public class ServiceCliente {

	private final ClienteREPO clienteRepo;

	public ServiceCliente(ClienteREPO clienteRepo) {
		this.clienteRepo = clienteRepo;
	}

	public Cliente criarCliente(LocalDate data_nascimento, String cpf, String nome, String phone, char sexo,
			String email) throws ClienteExeptions {
		try {
			Cliente cliente = new Cliente();
			cliente.setNome(nome);
			cliente.setCpf(cpf);
			cliente.setData_nascimento(data_nascimento);
			cliente.setEmail(email);
			cliente.setSexo(sexo);
			return cadastroCliente(cliente);
		} catch (Exception e) {
			throw new ClienteExeptions("Tipo de dado invalido ou fora de ordem");
		}

	}

	public Cliente cadastroCliente(Cliente cliente) throws ClienteExeptions {
		if (clienteRepo.existsByCpf(cliente.getCpf())) {
			throw new ClienteExeptions("Cliente com CPF já cadastrado.");
		}
		return clienteRepo.save(cliente);
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

	public Optional<Cliente> getClientePorId(Integer id) {
		return clienteRepo.findById(id);
	}
}
