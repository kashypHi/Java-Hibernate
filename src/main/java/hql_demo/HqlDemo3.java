package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HqlDemo3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query qu=em.createQuery("select e.name, e.salary from Employee e");
		List<Object[]> data=qu.getResultList();
		for(Object[] obj:data) {
			String name=(String)obj[0]; //downcasting
			double salary=(Double)obj[1];//downcasting
	    System.out.println(name+" "+salary);
		}
	}

}
