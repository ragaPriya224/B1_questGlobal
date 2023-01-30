package org.sam.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//table per hierarchy
public class StoreTest {
	private static SessionFactory sessionFactory = null;
	public static void main(String args[])
	{
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		
//		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Contract_Employee.class);
		configuration.addAnnotatedClass(Regular_Employee.class);
		 sessionFactory = configuration.buildSessionFactory();
		 
		
		Session session=sessionFactory.openSession();
		
		 Transaction t=session.beginTransaction();  
	      
		    Employee e1=new Employee();  
		    e1.setName("pika Chawla");  
		      
		    Regular_Employee e2=new Regular_Employee();  
		    e2.setName("Vivek Kumar");  
		    e2.setSalary(50000);  
		    e2.setBonus(5);  
		      
		    Contract_Employee e3=new Contract_Employee();  
		    e3.setName("Arjun Kumar");  
		    e3.setPay_per_hour(1000);  
		    e3.setContract_duration("15 hours");  
		      
		    session.persist(e1);  
		    session.persist(e2);  
		    session.persist(e3);  
		      
		    t.commit();  
		    session.close();  
		    System.out.println("success");  
		
	}


	
}
