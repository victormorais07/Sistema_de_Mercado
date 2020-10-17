package br.com.mercado.dao;

import br.com.mercado.entidade.Produto;

public class ProdutoDao extends GenericDaoImpl<Produto>{
	public ProdutoDao(){
		super(Produto.class);
	}

}
