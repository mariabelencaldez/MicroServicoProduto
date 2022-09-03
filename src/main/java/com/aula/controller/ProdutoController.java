package com.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aula.entidades.Produto;
import com.aula.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoService service;
	
	@GetMapping("")
	public ResponseEntity<List<Produto>> consultar(){
		return ResponseEntity.status(HttpStatus.OK).body(service.consultaProdutos());
	}
	
	@PutMapping("")
	public ResponseEntity<String> atualizarEstoque(@RequestParam("idproduto") Long idproduto, @RequestParam("qtde")
	float qtde){
		service.atualizaEstoque(idproduto, qtde);
		return ResponseEntity.status(HttpStatus.OK).body("Estoque atualizado com secesso");
	}
}
