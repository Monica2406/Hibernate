package one_to_one_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = session.get(Employee.class,1);
		if(employee!=null) {
			System.out.println(employee.getEmpName()+" "+employee.getAccount().getAccountNumber());
		}
		System.out.println("____________________");
		Accounts account = session.get(Accounts.class, 1);
		if(account!=null) {
			System.out.println(account.getAccountNumber()+" "+account.getEmployee().getEmpName());
		}

	}

}
