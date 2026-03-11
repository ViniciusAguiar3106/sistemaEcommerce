package br.com.senai.sistema_ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.sistema_ecommerce.entity.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
