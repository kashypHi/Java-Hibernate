package hql_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_demo.Employee;

public class HqlDemo4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query qu1=em.createQuery("select e from Employee e where e.id=2");
		List<Employee>emps=qu1.getResultList();
		for(Employee e:emps) {
			System.out.println(e);
		}
		System.out.println("-----------------------");
		
		Query qu2=em.createQuery("select emp from Employee emp where emp.id in(1,2)");
		List<Employee>emps1=qu2.getResultList();
		for(Employee e:emps1) {
			System.out.println(e);
		
	}
	}
}
