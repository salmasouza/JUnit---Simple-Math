package br.com.salmasouza.math;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		//Double actual = math.sum(6.2D, 2D);
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
		Double expected = 8.2D;
		assertEquals(expected, actual, 
				() -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
		assertNotEquals(9.2,actual);
		assertNotNull(actual);
	}
	
	@Test
	void testSub() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
		Double expected = 4.2D;
		assertEquals(expected, actual, 
				() -> firstNumber + "+" + secondNumber + " did not produce " + expected + "!");
		
		
	}
	
	
	@Test
	void testMult() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
		Double expected = 12.4D;
		assertEquals(expected, actual, 
				() -> firstNumber + "-" + secondNumber + " did not produce " + expected + "!");
		
		
	}
	
	@Test
	void testDiv() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
		Double expected = 3.1D;
		assertEquals(expected, actual, 
				() -> firstNumber + "/" + secondNumber + " did not produce " + expected + "!");
		
		
	}
	
	@Test
	void testMean() {
		
		SimpleMath math = new SimpleMath();
		double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber,secondNumber);
		Double expected = 4.1;
		assertEquals(expected, actual, 
				() -> "(" + firstNumber + "+" + secondNumber + ")/2" + " did not produce " + expected + "!");
		
		
	}
	
	@Test
	void testRaiz() {
		
		SimpleMath math = new SimpleMath();
		double number = 4.0D;
		
		Double actual = math.squareRoot(number);
		Double expected = 2.0D;
		assertEquals(expected, actual, 
				() -> number + "+" +  " did not produce " + expected + "!");
		
		
	}

}
