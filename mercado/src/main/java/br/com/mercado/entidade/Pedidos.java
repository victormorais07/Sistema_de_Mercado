package br.com.mercado.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pedidos implements Serializable {
	
	 
	
				/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
				@Id
				@GeneratedValue
				private Integer id;
				private int codigoCliente;
				private Date dataDoPedido;
				public Integer getId() {
					return id;
				}
				public void setId(Integer id) {
					this.id = id;
				}
				public int getCodigoCliente() {
					return codigoCliente;
				}
				public void setCodigoCliente(int codigoCliente) {
					this.codigoCliente = codigoCliente;
				}
				public Date getDataDoPedido() {
					return dataDoPedido;
				}
				public void setDataDoPedido(Date dataDoPedido) {
					this.dataDoPedido = dataDoPedido;
				}
				
				

}
