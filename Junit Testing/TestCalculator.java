package com.edu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.edu.calc.CalculatorOperations;



public class TestCalculator {
	
	CalculatorOperations obj = new CalculatorOperations();
	
	@BeforeClass
	public static void beforeAllTest() {
		System.out.println("Executed only once before all test cases");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Executed before test case");
	}
	
	@Test
	public void addTest() {
		
		int ans = obj.addition();
		assertEquals(30, ans);
		
	}
	
	@Test
	public void subTest() {
		int ans = obj.subtraction();
		assertEquals(10, ans);
	}
	
	@Test
	public void mulTest() {
		int ans = obj.multiplication();
		assertEquals(8, ans);
	}
	
	@Test
	public void divTest() {
		int ans = obj.division();
		assertEquals(2, ans);
	}
	
	@After
	public void afterTest() {
		System.out.println("Executed after test case");
	}
	

	
	@AfterClass
	public static void afterAllTest() {
		System.out.println("Executed only once after all test cases");
	}
	


}
