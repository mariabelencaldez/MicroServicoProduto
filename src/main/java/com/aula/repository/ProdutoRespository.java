package com.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.entidades.Produto;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Long>{

	
}
