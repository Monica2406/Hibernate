package com.learning.Hibernate.embeddedObjects;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {

	public static void main(String[] args) {
		Address a = new Address("Banglore","Karnataka");
		Student s1 = new Student("Varun",a);
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Student Added Successfully");
		
		

	}

}
