package com.testing.junit_mockito_testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testDivisionOfIntegers() {
		
		MathUtils mUtils= new MathUtils();
		/* Possible test cases */
		// 10, 2 -> 5
		assertEquals(5, mUtils.divisionOfIntegers(10, 2)); //assertEquals(expected output, actual output)
		
		// 18, 7 -> 2
		assertEquals(2, mUtils.divisionOfIntegers(18, 7));
		
		// 10, 0 -> Arithmetic Exception
		assertThrows(ArithmeticException.class, () -> mUtils.divisionOfIntegers(10, 0));
		
		// 0, 0 -> Arithmetic Exception
		assertThrows(ArithmeticException.class, () -> mUtils.divisionOfIntegers(0, 0));
		
		// -10, 2 -> 5
		assertEquals(-2, mUtils.divisionOfIntegers(-10, 5));
		
		// -10, -2 -> 5
		assertEquals(5, mUtils.divisionOfIntegers(-10, -2));
		
	}

	
}
