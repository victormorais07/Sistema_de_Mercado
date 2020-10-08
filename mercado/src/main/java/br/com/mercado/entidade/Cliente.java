package br.com.mercado.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
 
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
