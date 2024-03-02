package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HqlDemo2 {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	Query qu=em.createQuery("select e.name from Employee e");
	List<String>names=qu.getResultList();
	
	for(String s:names) {
		System.out.println(s);
	}
	
}
}
