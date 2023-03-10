package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.request.EmployeeRequest;


@Entity
public class Employee
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@JoinColumn(name="department_id")
	@OneToOne
	private Department department;
	
	public Employee()
	{
		super();
	}

	public Employee(EmployeeRequest request) 
	{
		this.name=request.getName();
	}
	public Employee(int id, String name, Department department) 
	{
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}