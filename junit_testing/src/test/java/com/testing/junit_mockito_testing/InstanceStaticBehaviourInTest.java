package com.testing.junit_mockito_testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

// If we want to use the same single object throughout the test method will be in use
@TestInstance(Lifecycle.PER_CLASS) // default is PER_method
class InstanceStaticBehaviourInTest {

	// For every calling of test method (@BeforeEach, @Test, @AfterEach)a new object will be created by JUnit
	
	static int i = 100; // class variable
	int j = 10; // instance variable
	
	@BeforeEach
	void first() {
		
		i++;
		j--;
	}
	
	@Test
	void test() {
		
		System.out.println("Test: "+ i +" "+ j);
	}

	@Test
	void anotherTest() {
		
		System.out.println("Another Test: "+ i +" "+ j);
	}
	
	@AfterEach
	void last() {
		
		i++;
		j--;
	}
	
	/*Output:
	 * if we are not using @TestInstance :--> Test: 101 9  , Another Test: 103 9  
	  
	 * if we are using @TestInstance :--> Test: 101 9  , Another Test: 103 7   
	 
	 */
}
