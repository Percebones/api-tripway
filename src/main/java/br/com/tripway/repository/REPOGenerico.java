package br.com.tripway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface REPOGenerico<Entidade> extends JpaRepository<Entidade, Long> {


}
