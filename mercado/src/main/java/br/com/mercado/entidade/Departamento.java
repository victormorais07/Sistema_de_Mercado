package br.com.mercado.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Departamento implements Serializable {

	private static final long serialVersionUID = 8133833800957069336L;

	@Id
	@GeneratedValue
	private Integer id;
	private String funcao;
	private String departamento;
	private float salario;


	public Departamento() {
		super();
	}

	
	
	/*
	 * private Funcionario funcionarios;
	 * 
	 * public Funcionario getFuncionarios() { return funcionarios; }
	 * 
	 * public void setFuncionarios(Funcionario funcionarios) { this.funcionarios =
	 * funcionarios; }
	 */
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
