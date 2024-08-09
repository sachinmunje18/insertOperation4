package Hibernate.InsertOperation4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf= configuration.buildSessionFactory();
		Session session =sf.openSession();
		Transaction ts= session.beginTransaction();
		
		
		Student student= new Student();
		student.setName("Sachin");
		student.setCity("Risod");
		student.setPincode(444506);
		
		session.save(student);
		ts.commit();
		System.out.println("Records inserted Successfully");

	}

}
