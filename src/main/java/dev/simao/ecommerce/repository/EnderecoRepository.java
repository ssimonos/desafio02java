package dev.simao.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.simao.ecommerce.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
