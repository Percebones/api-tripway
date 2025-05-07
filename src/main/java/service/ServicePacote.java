package service;

import dao.PacoteDAO;
import model.Compra;
import model.Pacote;

public abstract class ServicePacote extends PacoteDAO {

	void cadastroPacote(Pacote pacote) {
		save(pacote);
	}

	void updatePacote(Pacote pacote) {
		update(pacote);
	}

	void deletePacote(Pacote pacote) {
		delete(pacote);
	}

	void gteById(Pacote pacote) {
		findById(pacote);
	}

}
