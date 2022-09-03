package com.aula.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	private float estoque;
	
	private float preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getEstoque() {
		return estoque;
	}

	public void setEstoque(float estoque) {
		this.estoque = estoque;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Produto(String descricao, float estoque, float preco) {
		super();
		this.descricao = descricao;
		this.estoque = estoque;
		this.preco = preco;
	}

	public Produto() {
		
	}
	
	
	

}
