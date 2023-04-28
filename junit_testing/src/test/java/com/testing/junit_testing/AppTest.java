package com.testing.junit_testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Unit test for simple App. */

public class AppTest {
   
	// For all these two tests(test and secondTest) BeforeAll and AfterAll will run only once and all 
	// other method will run every time
	
	@BeforeAll
	static void init() {
		System.out.println("Inside Before All");
	}
	
	@BeforeEach
	void show() {
		
		System.out.println("Inside Before Each");
	}
	
	// NOTE: For test methods : return type is only void, cannot accept any parameter, cannot throw any exception
	
	@Test
	void test() {
		
		System.out.println("Inside Test");
	}
	
	@Test
	void secondTest() {
		
		System.out.println("Inside another Test");
	}
	
	@AfterEach
	void after() {
		
		System.out.println("Inside After Each");
	}
	
	@AfterAll
	static void destroy() {
		
		System.out.println("Inside After All");
	}
}
