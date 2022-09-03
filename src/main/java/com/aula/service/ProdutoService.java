package com.aula.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.entidades.Produto;
import com.aula.repository.ProdutoRespository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRespository repo;
	
	public List<Produto> consultaProdutos(){
		return repo.findAll();
	}
	
	public Produto atualizaEstoque(Long idProduto, Float qtde) {
		Optional<Produto> obj = repo.findById(idProduto);
		Produto p = obj.orElseThrow(() -> new EntityNotFoundException("produto não existe"));
		p.setEstoque(p.getEstoque() - qtde);
		return repo.save(p);
	}
}
