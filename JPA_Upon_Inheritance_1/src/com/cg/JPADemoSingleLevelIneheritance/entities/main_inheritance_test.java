package com.cg.JPADemoSingleLevelIneheritance.entities;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main_inheritance_test 
{
	public static void main(String[] args) 
	{
		//initial step common to all project to start the JPA Life Cycle
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		
		//create operation
		//creating reference for the Employee class 
		//creating one employee
		Employee emp = new Employee();
		emp.setEmployeeID(1);
		emp.setName("Nandan GN");
		emp.setSalary(300000);
		entityManager.persist(emp);

		
		//creating one manager
		//creating reference for the Employee class 
		Manager mgr = new Manager();
		mgr.setEmployeeID(2);
		mgr.setName("Govardhan Jayaram Sir");
		mgr.setDepartment("CEO");
		mgr.setSalary(1000000);
		entityManager.persist(mgr);
		

		
		entityManager.getTransaction().commit();
		System.out.println("Data inserted to database");
		entityManager.close();
		factory.close();
	}
}
