package calculator;

/**
 * @author Jose and Yenson
 * @version 1.0
 * Class that simulates a basic calculator
 */
public class Calculator {
	
	/**
	 * Method that multiplies two numbers
	 * @param a integer
	 * @param b integer
	 * @return integer
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
	
	/**
	 * Method that divides two numbers
	 * @param a integer
	 * @param b integer
	 * @return integer
	 */
	public int divide(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		}catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	/**
	 * Method that sustract two numbers
	 * @param a integer
	 * @param b integer
	 * @return integer
	 */
	public int substract(int a, int b) {
		return a - b;
	}
	
	/**
	 * Method that add two number
	 * @param a
	 * @param b
	 * @return integer
	 */
	public int addition(int a, int b) {
		return a + b;
	}

}
