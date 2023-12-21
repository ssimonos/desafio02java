package dev.simao.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.simao.ecommerce.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
