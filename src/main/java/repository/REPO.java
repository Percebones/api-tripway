package repository;

import java.sql.SQLException;
import java.util.Optional;

import jakarta.persistence.PersistenceException;

public interface REPO<Entidade> {
	public Class<Entidade> getEntityClass();

	void save(Entidade entidade) throws PersistenceException, SQLException;

	void delete(Entidade entidade) throws PersistenceException, SQLException;

	Optional<Entidade> findById(Object id) throws PersistenceException, SQLException;

}
