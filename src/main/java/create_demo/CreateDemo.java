package create_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class CreateDemo { 
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = new Employee(1,"shubham",4000.0);
		Employee emp1 = new Employee(2,"mohit",60000.0 );
		
		et.begin();
		em.persist(emp);
		em.persist(emp1);
		et.commit();
		
		
	}

}
