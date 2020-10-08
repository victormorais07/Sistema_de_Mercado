package br.com.mercado.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	   	@Id
	   	@GeneratedValue
	   	private Integer id;
	   	private String nomeProduto;
	   	private int codigoDoProduto;
	   	

}
