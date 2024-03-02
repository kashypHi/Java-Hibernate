package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_demo.Employee;

public class HqlDemo5 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query qu=em.createQuery("select e from Employee e where e.id=?1 and e.id=?2");
		qu.setParameter(1,1);
		qu.setParameter(2,2);
		List<Employee>emps=qu.getResultList();
		for(Employee e:emps) {
			System.out.println(e);
			
		System.out.println("----------------------------------");
		
		Query qu1=em.createQuery("select e from Employee e where e.id=:id1 and e.id=:id2");
		qu1.setParameter("id1",1);
		qu1.setParameter("id2",2);
		List<Employee>emps1=qu1.getResultList();
		for(Employee e1: emps1) {
				System.out.println(e1);
		}
		
	}
	}
	}
