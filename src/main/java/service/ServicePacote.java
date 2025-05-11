package service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Pacote;
import repository.PacoteREPO;

@Service
public class ServicePacote {

	@Autowired
	private PacoteREPO pacoteREPO;

	public Pacote criarPacote(String nome_pacote, float preco, LocalDate data_partida, LocalDate data_volta,
			String destino, String descricao, LocalDate checkIn, int qtd_dias) {
		Pacote pacote = new Pacote(nome_pacote, preco, data_partida, data_volta, destino, descricao, checkIn, qtd_dias);
		return cadastroPacote(pacote);

	}

	public Pacote cadastroPacote(Pacote pacote) {
		pacoteREPO.save(pacote);
		return pacote;
	}

	public void deletePacote(Pacote pacote) {
		pacoteREPO.delete(pacote);
	}

	public Optional<Pacote> getById(int id) {
		return pacoteREPO.findById(id);
	}

}
