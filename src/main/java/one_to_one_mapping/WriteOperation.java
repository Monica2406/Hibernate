package one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WriteOperation {

	public static void main(String[] args) {
		Accounts a1 = new Accounts();
		a1.setAccountNumber("SBI123");
		
		Employee e1 = new Employee();
		e1.setEmpName("Harsh");
		e1.setAccount(a1);
		
		a1.setEmployee(e1);
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Accounts.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
		
		System.out.println("Employee object saved..");
		session.close();
		factory.close();

	}

}
