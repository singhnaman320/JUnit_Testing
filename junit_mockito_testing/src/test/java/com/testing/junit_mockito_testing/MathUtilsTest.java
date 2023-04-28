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

	@Test
	void testDivisionOfDouble() {
		
		MathUtils mUtils = new MathUtils();
		/* Possible test cases */
		// 10.5, 3.5 -> 3.0
		assertEquals(3.0, mUtils.divisionOfDouble(10.5, 3.5));
		
		// 11.0, 2.0 -> 5.5
		assertEquals(5.5, mUtils.divisionOfDouble(11.0, 2.0));
		
		// -10.5, 3.5 -> -3.0
		assertEquals(-3.0, mUtils.divisionOfDouble(-10.5, 3.5));
	
		// -12.0, 6.0 -> -2.0
		assertEquals(-2.0, mUtils.divisionOfDouble(-12.0, 6.0));
		
		// 10.0, 0.0 -> Infinite // because its double
		assertTrue(Double.valueOf(mUtils.divisionOfDouble(10.0, 0.0)).isInfinite());
		//OR 
		//Double.isInfinite(mUtils.divisionOfDouble(10.0, 0.0));
		
		// 0.0, 0.0 -> NaN // because its double
		assertTrue(Double.valueOf(mUtils.divisionOfDouble(0.0, 0.0)).isNaN());
	
	}
	
	// What was alternative before assertThrows?
	//ExpectedException(AE.class)--->JUnit-4
	
}
