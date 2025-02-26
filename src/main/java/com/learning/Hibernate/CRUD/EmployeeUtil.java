package com.learning.Hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class EmployeeUtil {
	private static SessionFactory factory=null;
	private static SessionFactory getFactory() {
		Configuration con = new Configuration();
		if(factory==null) {
			factory = con.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;	
	}
	public static String addEmployee(Employee e) {
		Session session = getFactory().openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();
		return "Employee added successfully";
	}
	public static Employee getEmployeeById(int Id) {
		Session session = getFactory().openSession();
		Employee employee = session.get(Employee.class, Id);
		if(employee!=null) {
			return employee;
		}
		return null;
	}
	public static String updateEmployee(int id,Employee newEmployee) {
		Session session = getFactory().openSession();
		Employee employee = session.get(Employee.class,id);
		if(employee!=null) {
			employee.setEmpName(newEmployee.getEmpName());
			employee.setDeptName(newEmployee.getDeptName());
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			session.close();
			return "Employee updated successfully";
		}
		return "No employee found to Update";
	}
	public static String deleteEmployee(int id) {
		Session session = getFactory().openSession();
		Employee employee = session.get(Employee.class,id);
		if(employee!=null) {
			session.beginTransaction();
			session.remove(employee);
			session.getTransaction().commit();
			session.close();
			return "Employee deleted successfully";
		}
		return "No employee found to be deleted";
		}
	}
	

