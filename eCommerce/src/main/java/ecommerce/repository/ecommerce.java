package ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecommerce.model.produto;


@Repository
public interface ecommerce<Produto> extends JpaRepository<produto, Long> {

	public List<produto> findAllByNomeContainingIgnoreCase (String nome);
}
	

