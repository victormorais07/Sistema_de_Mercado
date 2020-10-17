package br.com.mercado.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.mercado.hibernateUtil.HibernateUtil;

public class GenericDaoImpl<T> implements GenericDao<T> {
 
	
	
	  private Class persistenceClass;
	  
	  


	@SuppressWarnings("rawtypes")
	public GenericDaoImpl(Class c) {
		  this.persistenceClass = c;
	  }
	
	
	
	
	@Override
	public void adicionar(T obj) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.save(obj);
		tran.commit();
		session.close();
		
	}

	@Override
	public void atualizar(T obj) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
		session.saveOrUpdate(obj);
		session.flush();
		session.refresh(obj);
		tran.commit();
		session.close();
		session.close();
	}

	@Override
	public List<T> recuperarTodos() {
		Session session = HibernateUtil.getSession();
			Criteria buscar = session.createCriteria(persistenceClass);
			List resultado = new ArrayList<>();
			resultado = buscar.list();
			
		return resultado;
	}

	@Override
	public T recuperarPorId(Serializable id) {
		Session session = HibernateUtil.getSession();
			T obj = (T) session.get(persistenceClass, id);
			
		
		return obj;
	}

	@Override
	public void excluir(T obj) {
		Session session = HibernateUtil.getSession();
		Transaction tran = session.beginTransaction();
			session.delete(obj);
			session.flush();
			tran.commit();
			session.close();
		
	}
	

}
