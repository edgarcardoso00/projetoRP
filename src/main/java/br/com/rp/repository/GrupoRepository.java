package br.com.rp.repository;

import br.com.rp.model.Grupo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Long> {

}
