package ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import ecommerce.model.Categoria;


public interface categoriaRepository extends JpaRepository<Categoria, Long> {
		
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
}