package dev.simao.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.simao.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
