package ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import ecommerce.model.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
public List<usuario> findAllByNomeContainingIgnoreCase (String nome);
}