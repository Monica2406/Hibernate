package com.learning.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Product p = new Product();
		//p.setProductId(101);
		p.setProductName("HP-1524");
		p.setProductPrice(87000.45);
		p.setProductCategory("Laptop");
		
		// get configuration object
		Configuration configuration = new Configuration(); 
		
		//get object of SessionFactory(I)
		SessionFactory sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		
		//get object of Session(I)
		Session session = sessionFactory.openSession();
		
		
		//task(DML)
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		System.out.println("Product saved successfully");
		
		
		
		//close session object
		session.close();
		
		
		//close the session-factory
		sessionFactory.close();
	}

}
