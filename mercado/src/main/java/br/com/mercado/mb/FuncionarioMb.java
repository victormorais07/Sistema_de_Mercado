package br.com.mercado.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.mercado.dao.DepartamentoDao;
import br.com.mercado.dao.FuncionarioDao;
import br.com.mercado.entidade.Departamento;
import br.com.mercado.entidade.Funcionario;

@ViewScoped
@ManagedBean
public class FuncionarioMb {

	
					private Funcionario funcionario;
					private List<Funcionario> listaFuncionario;
					
					private FuncionarioDao dao;
					private Departamento dp ;
					private List<Departamento> listaDp;
					private DepartamentoDao daoDp;
					private String teste;
					
					
					
					@PostConstruct
					public void init() {
						daoDp = new DepartamentoDao();
						funcionario = new Funcionario();
						listaFuncionario = new ArrayList<>();
						
						dao = new FuncionarioDao();
						dp = new Departamento();
						listaDp = new ArrayList<>();
						listaDp = daoDp.recuperarTodos();
						listaFuncionario = dao.recuperarTodos();
					}

                         
					public String getTeste() {
						return teste;
					}


					public void setTeste(String teste) {
						this.teste = teste;
					}


					public List<Departamento> getListaDp() {
						return listaDp;
					}


					public void setListaDp(List<Departamento> listaDp) {
						this.listaDp = listaDp;
					}


					public Departamento getDp() {
						return dp;
					}


					public void setDp(Departamento dp) {
						this.dp = dp;
					}


					public Funcionario getFuncionario() {
						return funcionario;
					}


					public void setFuncionario(Funcionario funcionario) {
						this.funcionario = funcionario;
					}


					public List<Funcionario> getListaFuncionario() {
						return listaFuncionario;
					}


					public void setListaFuncionario(List<Funcionario> listaFuncionario) {
						this.listaFuncionario = listaFuncionario;
					}
					
					
					public void adicionar() {
						dp.setDepartamento(dp.getDepartamento());
						funcionario.setDepartamento(dp);
						dao.adicionar(funcionario);
						funcionario = new Funcionario();
						dp = new Departamento();
						
					}
				
					public void teste() {
						System.err.println("testeee");
						System.err.println(this.dp.getId());
					}
}
