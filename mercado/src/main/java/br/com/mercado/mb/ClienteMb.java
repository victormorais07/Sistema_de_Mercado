package br.com.mercado.mb;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.mercado.dao.ClienteDao;
import br.com.mercado.entidade.Cliente;

@ViewScoped
@ManagedBean
public class ClienteMb {
	
				private Cliente cliente;
				private List<Cliente> listaCliente;
				private ClienteDao dao;
				private String btnCliente;
				private List<Cliente> listaProcurar;
				private String procurar;
				private List<Cliente> clienteAux;
				@PostConstruct
				public void init() {
					
					cliente = new Cliente();
					dao = new ClienteDao();
					listaCliente = new ArrayList<>();
					listaCliente = dao.recuperarTodos();
					listaProcurar = new ArrayList<>();
					clienteAux = new ArrayList<>();
				}
				
				
				public List<Cliente> getClienteAux() {
					return clienteAux;
				}


				public void setClienteAux(List<Cliente> clienteAux) {
					this.clienteAux = clienteAux;
				}


				public String getProcurar() {
					return procurar;
				}


				public void setProcurar(String procurar) {
					this.procurar = procurar;
				}


				public Cliente getCliente() {
					return cliente;
				}

				public void setCliente(Cliente cliente) {
					this.cliente = cliente;
				}

				public List<Cliente> getListaCliente() {
					return listaCliente;
				}

				public void setListaCliente(List<Cliente> listaCliente) {
					this.listaCliente = listaCliente;
				}
				
				
				public String getBtnCliente() {
					return btnCliente;
				}


				public void setBtnCliente(String btnCliente) {
					this.btnCliente = btnCliente;
				}
				
				
				public List<Cliente> getListaProcurar() {
					return listaProcurar;
				}


				public void setListaProcurar(List<Cliente> listaProcurar) {
					this.listaProcurar = listaProcurar;
				}


				public void habilitarTodos() {
              this.setBtnCliente("todos");
				}
				public void habilitarPesquisar() {
					this.btnCliente = "pesquisar";
				}
				public boolean exibirTodos() {
					return "todos".equals(this.btnCliente);
				}
				public boolean exibirPesquisar() {
					return "pesquisar".equals(this.btnCliente);
				}


				public void cadastrar() {
					dao.adicionar(cliente);
					cliente = new Cliente();
				}
				
				public void procurarCliente() {
					
					listaProcurar = dao.consultarCliente(this.getProcurar());
				}
				
				public void excluir(Cliente obj) {
					dao.excluir(obj);
					listaCliente = dao.recuperarTodos();
					
				}
				public void atualizar(Cliente obj) {
					dao.atualizar(obj);
					listaCliente = dao.recuperarTodos();
				}
}
