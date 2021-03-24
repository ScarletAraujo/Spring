package org.scarletaraujo.bolggeneration17.repository;

import org.scarletaraujo.bolggeneration17.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface postagemRepository extends JpaRepository<Postagem, Long>{
	
	public List < Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
	

}
