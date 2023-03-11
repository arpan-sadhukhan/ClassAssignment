package com.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatException;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.util.VisibleForTesting;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems.entity.Employee;
import com.ems.exception.GlobalException;
import com.ems.service.EmployeeService;

@TestMethodOrder(value=org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {
	
	EmployeeService empService;
	
	@BeforeEach
	void setup()
	{
		empService=new EmployeeService();
	}
	
	@AfterEach
	void cleanup()
	{
		empService=null;
		System.out.println("object is garbage collected");
	}

	@Test
	@DisplayName("Test for addEmployee method")
	@Order(2)
	public void addEmployeeTest() {
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		empService.addEmployee(102, "sam", 4400000, "kolkata", "India");
		
		assertEquals(2, empService.lengthOfList());
	}
	
	@Test
	@DisplayName("Test for displayAll method")
	@Order(value=1)
	public void displayAllTest()
	{
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		assertThat(empService.displayAll()).isNotNull();
	}
	
//	@Test
//	public void displayEmpById() {
//		
//		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
//		assertThat(empService.displayEmployeeById(101)).isNotNull();
//		
//		
//	}
	
	@Test
	public void displayEmpByIdTest()throws GlobalException
	{
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		Employee e=empService.displayEmployeeById(101);
		assertThat(e.getEmpName()).isEqualTo("Arpan");
//		assertEquals("Arpan", e.getEmpName());
		
	}
	
	@Test
	public void updateByIdTest()throws GlobalException
	{
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		Employee e=empService.updateById(101);
		assertEquals("abc", e.getEmpName());
		
	}
	
	@Test
	public void deleteEmpTest()throws GlobalException
	{
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		empService.addEmployee(102, "Arp", 4400000, "kolkata", "India");
		empService.deleteEmp(101);
//		assertEquals(null, e.getEmpId());
		assertEquals(1,empService.lengthOfList());
		
		
	}	
	
	@Test
	public void appraisalTest()throws GlobalException
	{
		empService.addEmployee(101, "Arpan", 4400000, "serampore", "India");
		empService.addEmployee(102, "Arp", 4400000, "kolkata", "India");
		
		assertEquals(5000, empService.appraisal(101));
		
	}
	
	
	

}
