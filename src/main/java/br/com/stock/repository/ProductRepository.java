package br.com.stock.repository;

import br.com.stock.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produto, Long> {

}
