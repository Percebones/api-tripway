package repository;

import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public abstract class REPOGenerico<Entidade> implements REPO<Entidade> {

	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public void save(Entidade entidade) {
		Object id = entityManager.getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entidade);
		if (id == null) {
			entityManager.persist(entidade);
		} else {
			entityManager.merge(entidade);
		}
	}

	@Override
	public void delete(Entidade entidade) {
		Object id = getId(entidade);
		Entidade entidadeToRemove = entityManager.find(getEntityClass(), id);
		if (entidadeToRemove != null) {
			entityManager.remove(entidadeToRemove);
		}
	}

	@Override
	public Optional<Entidade> findById(Object id) {
		Entidade entidade = entityManager.find(getEntityClass(), id);
		return Optional.ofNullable(entidade);
	}

	protected abstract Object getId(Entidade entidade);

}
