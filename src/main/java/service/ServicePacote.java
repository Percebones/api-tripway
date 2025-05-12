package service;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.tokens.Token.ID;

import exeptions.PacoteExeptions;
import model.Cliente;
import model.Compra;
import model.Pacote;
import repository.PacoteREPO;

@Service
public class ServicePacote {

	@Autowired
	private PacoteREPO pacoteREPO;

	public Pacote criarPacote(String nome_pacote, float preco, LocalDate data_partida, LocalDate data_volta,
			String destino, String descricao, LocalDate checkIn, int qtd_dias, Blob imagem_pacote)
			throws PacoteExeptions {
		if (data_partida.isAfter(data_volta)) {
			throw new PacoteExeptions("Data de partida precisa ser antes da data da volta");
		}
		if (preco < 0) {
			throw new PacoteExeptions("Preco do pacote nao pode ser negativo");
		}
		if (destino == null || destino.isEmpty()) {
			throw new PacoteExeptions("O destino não pode ser vazio.");
		}
		Pacote pacote = new Pacote(nome_pacote, preco, data_partida, data_volta, destino, descricao, checkIn, qtd_dias,
				imagem_pacote);
		return cadastroPacote(pacote);
	}

	public void deletePacote(Pacote pacote) {
		pacoteREPO.delete(pacote);
	}

	public Pacote cadastroPacote(Pacote pacote) {
		return pacoteREPO.save(pacote);
	}

	public Iterable<Pacote> getAllClientes() {
		return pacoteREPO.findAll();
	}

	public Optional<Pacote> getCompraPorId(ID id) {
		return pacoteREPO.findById(id);
	}

}
