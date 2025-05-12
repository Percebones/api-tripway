package br.com.tripway.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface REPOGenerico<Entidade> extends CrudRepository<Entidade, Long> {

	
	
}
