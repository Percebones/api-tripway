package dao;

import java.util.Optional;

public interface DAO<Entidade> {
	public Class<Entidade> getEntityClass();

	void save(Entidade entidade);

	void update(Entidade entidade);

	void delete(Entidade entidade);

	Optional<Entidade> findById(Object id);

}
