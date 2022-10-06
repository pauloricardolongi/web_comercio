package br.com.comercio.dao;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

import br.com.comercio.domain.Fornecedor;
import br.com.comercio.domain.Produto;

public class ProdutoDAOTest {
	@SuppressWarnings("deprecation")
	@Test
	@Ignore
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("2"));
		
		Produto produto = new Produto();
		produto.setDescricao("Jogo de chaves philips");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
}