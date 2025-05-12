package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.tokens.Token.ID;

@Repository
public interface REPOGenerico<Entidade> extends CrudRepository<Entidade, ID> {

	
	
}
