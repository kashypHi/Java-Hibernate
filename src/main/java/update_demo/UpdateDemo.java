package update_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = new Employee(2," rahul vaidya",30000.0);
		Employee emp1 = em.find(Employee.class, 1);
		
		emp1.setName("ShubhAM MISHRA");
		
		et.begin();
		em.merge(emp);
	//	em.merge(emp1);
		et.commit();
	}

}


