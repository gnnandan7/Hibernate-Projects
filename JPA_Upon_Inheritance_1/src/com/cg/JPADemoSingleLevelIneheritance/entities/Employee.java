package com.cg.JPADemoSingleLevelIneheritance.entities;

import java.io.Serializable;

import javax.annotation.processing.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//to select entire schema
@Entity

//to select the particular table
@Table(name = "emp_database")

//when ever we are using inheritance concept to store data into database we need to follow this syntax only in parent class 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

//additional column to differ from 'parent' and 'class' ----> it creates a table emp_type automatically 
@DiscriminatorColumn(name = "emp_type", discriminatorType = DiscriminatorType.STRING)

//parent row will have this value in Discriminator column
@DiscriminatorValue("Employee")

public class Employee implements Serializable
{
	/**
	 * @Note - Where there is entity class we need to give SerialVersionUID=1L;
	 */
	public static final long SerialVersionUID=1L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) //to auto increment the data into database
	private int employeeID;
	private String name;
	private double salary;
	
	
	public int getEmployeeID() 
	{
		return employeeID;
	}
	public void setEmployeeID(int employeeID) 
	{
		this.employeeID = employeeID;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public double getSalary()
	{
		return salary;
	}
	
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
}
