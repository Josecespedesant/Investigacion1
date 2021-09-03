package unit_test;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

/**
 * @author Jose and Yenson
 * @version 1.0
 * Class that tests a the class Calculator
 */
class CalculatorTesting {
	
	Calculator calculator; //Class to be tested
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator(); //Setting up the calculator
	}
	
	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
	}
	
	@Test
	@DisplayName("Simple division should work")
	void testDivision() {
		assertEquals(0, calculator.divide(0, 5), "Regular division should work");
	}
	
	@Test
	@DisplayName("Simple addition should work")
	void testAddition() {
		assertEquals(9, calculator.addition(4, 5), "Regular addition should work");
	}
	
	@Test
	@DisplayName("Simple substraction should work")
	void testSubstraction() {
		assertEquals(-1, calculator.substract(4, 5), "Regular substraction should work");
	}
	
	

}
