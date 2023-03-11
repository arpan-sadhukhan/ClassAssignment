package com.ems.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

public class EmployeeService {
	
	private List<Employee> emp=new ArrayList<>();
	
	public void addEmployee(long empId, String empName, double empSal, String city, String country)
	{
		Address add=new Address(city, country);
		emp.add(new Employee(empId, empName, empSal, add));
	}
	
	public List<Employee> displayAll()
	{
		return emp;
	}
	
	public int lengthOfList()
	{
		return emp.size();
	}
	
//	public List<Employee> displayEmployeeById(long id)
//	{
//		List<Employee> e1 = null;
//		for( Employee e:emp)
//		{
//			if(e.getEmpId()==id) 
//				  e1=Arrays.asList(new Employee(e.getEmpId(), e.getEmpName(), e.getEmpSal(), e.getAddress()));
//				
//							
//		}
//		return e1;
//	}

	public Employee displayEmployeeById(long id) throws GlobalException
	{
		int i;
		for(i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
				return emp.get(i);
		}
		if(i==emp.size())		
			throw new GlobalException("employee not flound");
						
		
		return null;
	}
	
	public Employee updateById(long id)throws GlobalException
	{
//		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				
				emp.get(i).setEmpName("abc");
				emp.get(i).setEmpSal(34000000);
				emp.get(i).setAddress(new Address("NY", "USA"));
				return emp.get(i);
			}
		}
		if(i==emp.size())
			throw new GlobalException("employee not flound");
		return null;
	}
	
	
	public List<Employee> deleteEmp(long id)throws GlobalException
	{

		int i;
		for(i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				emp.remove(i);
				
				return emp;
			}
		}
		if(i==emp.size())
			throw new GlobalException("employee not flound");
		return null;
	}
	
	public int appraisal(long id)throws GlobalException
	{
		int i;
		int appraisal=0;
		for(i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				if(emp.get(i).getEmpSal()<=10000)
					appraisal= 1000;
				else
					appraisal= 5000;
				return appraisal;
			}
		}
		if(i==emp.size())
			throw new GlobalException("employee not flound");
		return (Integer) null;
		
	}
	
	
}
