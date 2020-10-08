package br.com.mercado.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T> {
	
	public void adicionar(T obj);
	public void atualizar(T obj);
	public List<T> recuperarTodos();
	public T recuperarPorId(Serializable id);
	public void excluir (T obj);

}
