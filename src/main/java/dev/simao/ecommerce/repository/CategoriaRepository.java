package dev.simao.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.simao.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

        
}
