package br.com.mercado.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.mercado.entidade.Cliente;
import br.com.mercado.hibernateUtil.HibernateUtil;
 
public class ClienteDao extends GenericDaoImpl<Cliente> {

	public ClienteDao() {
		super(Cliente.class);
	}
	

	 private Session session = HibernateUtil.getSession();
	 private Transaction tran = session.beginTransaction();
	 
	  public List<Cliente> consultarCliente(String obj) {
		     Query consulta = session.createQuery("from Cliente where nome = ? " );
		     consulta.setParameter(0,obj);
		   List<Cliente> lista = new ArrayList<>();
		   lista = consulta.list();
		   
		  return lista;
	  }
	
}
