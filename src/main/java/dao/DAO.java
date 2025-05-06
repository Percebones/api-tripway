package dao;

public interface DAO<Entidade> {
	public Class<Entidade> getEntityClass();

	void save(Entidade entidade);

	void update(Entidade entidade);

	void delete(Entidade entidade);

	Entidade findById(Entidade entidade);

}
