package br.com.mercado.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;
	
	static {
			sf = new Configuration().configure().buildSessionFactory();
	}

	
			public static Session getSession() {
				return sf.openSession();
			}
}
