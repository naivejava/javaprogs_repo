package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import JavaKnowledge.divideTwoNumbers;

/*
 * In this demo, the function of divNum method is tested here. The expected result and the 
 * calculated results are the same, so the test is passed.
 * 
 *  JUnit is an open source and can run in a number of IDEs, eg, Eclipse, NetBeans, ItelliJ, etc
 *  
 */

public class divideTwoNumbersTest {

	@Test
	public void testDivNum() {
		
		divideTwoNumbers num = new divideTwoNumbers();
		
		int result = num.divNum(25, 25);           // The result will be 1
		
		//Method of the JUnit, the first argument is the expected, the second is the calculated 
		assertEquals(5, result);
	}
	
	/*A number of test cases can be defined in one class, or a separate test case can be define for each
	class and/or method
	*/
	
	@Test
	public void testAdd() {
		
		divideTwoNumbers num2 = new divideTwoNumbers();
		
		int result2 = num2.addNum(30, 30);           // The result will be 60
		
		//Method of the JUnit, the first argument is the expected, the second is the calculated 
		assertEquals(6, result2);
	}


}
