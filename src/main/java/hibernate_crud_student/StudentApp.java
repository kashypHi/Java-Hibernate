package hibernate_crud_student;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_crud_student1.Student;
import hibernate_demo.Employee;

public class StudentApp {
	
	//Add student
	public static void addStudent() {
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		System.out.println("Enter id:- ");
		int id= sc.nextInt();
		System.out.println("Enter Name:-");
		String name=sc.next();
		System.out.println("Enter Age:-");
		int Age=sc.nextInt();
		System.out.println("Enter percentage:-");
		double percentage=sc.nextDouble();
		
		et.begin();
		Student s1=new Student(id,name,Age,percentage);
		em.persist(s1);
 		et.commit();
 		
 		System.out.println("---Data inserted sucessfully---");
	}
	
		public  static void remove() {
			Scanner sc=new Scanner(System.in);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			System.out.println("Enter id:-");
			int id=sc.nextInt();
			Student s1=em.find(Student.class,id);
			et.begin();
			em.remove(s1);
			et.commit();
			System.out.println("--data deleted sucessfully---");
		}
		public static void findstudent() {
			Scanner sc=new Scanner(System.in);
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			System.out.println("Enter id:-");
			int id=sc.nextInt();
			Student s1=em.find(Student.class,id);
			System.out.println(s1);
			System.out.println("--data find sucessfully");
		}
		
		public static void findAll() {
			
		}
		

	public static void main(String[] args) {
		
		
		//add student 
	//	Student stu = new Student(101,"Raghav",20, 68.5);
	//	Student stu1 = new Student(102,"mohit",21,72.5);
		
		
		 
		
		
		//remove stud
		
		
		
	
		

	
		
		
	}

}
