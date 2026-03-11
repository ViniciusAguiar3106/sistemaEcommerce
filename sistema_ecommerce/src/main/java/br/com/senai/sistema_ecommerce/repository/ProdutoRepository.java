package br.com.senai.sistema_ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.sistema_ecommerce.entity.Produto;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
