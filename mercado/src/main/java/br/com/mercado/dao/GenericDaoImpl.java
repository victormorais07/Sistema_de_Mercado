package br.com.mercado.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.mercado.hibernateUtil.HibernateUtil;

public class GenericDaoImpl<T> implements GenericDao<T> {
 
	
	  private Session session = HibernateUtil.getSession();
	  private Transaction tran = session.beginTransaction();
	  private Class persistenceClass;
	  
	  @SuppressWarnings("rawtypes")
	public GenericDaoImpl(Class c) {
		  this.persistenceClass = c;
	  }
	
	
	
	
	@Override
	public void adicionar(T obj) {
		
		session.save(obj);
		tran.commit();
		session.close();
		
	}

	@Override
	public void atualizar(T obj) {
		
		session.saveOrUpdate(obj);
		session.flush();
		session.refresh(obj);
		tran.commit();
		session.close();
	}

	@Override
	public List<T> recuperarTodos() {

			Criteria buscar = session.createCriteria(persistenceClass);
			List resultado = new ArrayList<>();
			resultado = buscar.list();
			
		return resultado;
	}

	@Override
	public T recuperarPorId(Serializable id) {
			
			T obj = (T) session.get(persistenceClass, id);
			
		
		return obj;
	}

	@Override
	public void excluir(T obj) {

			session.delete(obj);
			tran.commit();
			session.close();
		
	}
	

}
