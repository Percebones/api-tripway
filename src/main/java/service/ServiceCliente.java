package service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Cliente;
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

	public Cliente cadastroCliente(Cliente cliente) {
		clienteRepo.save(cliente);
		return cliente;
	}

	public void deleteCliente(Cliente cliente) {
		clienteRepo.delete(cliente);
	}

	public Optional<Cliente> getById(int id) {
		return clienteRepo.findById(id);
	}
}
