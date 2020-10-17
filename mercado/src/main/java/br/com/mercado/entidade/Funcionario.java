package br.com.mercado.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4047045270545451650L;

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String cidade;
	private int cpf;
	private String bairro;
	private int numeroCasa;
	
	@ManyToOne
	//(cascade = CascadeType.ALL)
	private Departamento departamento ;

	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

//	@OneToOne(cascade = CascadeType.ALL) 
	//private Departamento dp;
	
	

	public Departamento getDepartamento() {
		return departamento;
	}
	



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/*
	 * public Departamento getDp() { return dp; }
	 * 
	 * public void setDp(Departamento dp) { this.dp = dp; }
	 */
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
