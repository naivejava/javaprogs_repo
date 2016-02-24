/**
 * Testing some assertions
 * 
 * The modifiers must be public for all methods in the test class
 * The return type of a method must be void
 * 
 */
package JUnitTest;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.notification.*;

/**
 * 
 * @author Kamal Muhammad
 * 
 */

// @Ignore   Put @Ignore on top of a class, all test cases will be ignored in this class
public class TestAssertions {

	@Test         //Testing assertions
	public void testSomeAssertions() {
		int val1 = 8, val2 = 7;
		
		String str1 = "I am a string";
		String str2 = "I am a string";
		String str3 = "I am not null";
		String str4 = null;
		
		String[] expectedArray = {"one", "two", "three"};
		String [] actualArray = {"one", "two", "three"};
		
		//Check that the two objects are equal, the test will fail
		assertEquals(val1, val2);
		
		//Check that the two objects are not equal, the test will pass
		assertNotEquals(val1, val2);
		
		//Check for not null
		assertNotNull(str3);
		
		//Check for null
		assertNull(str4);
		
		//Check that the two strings are the same
		assertSame(str1, str2);
		
		//Check that the two arrays are not the same
		assertNotSame(str1, str3);
		
		//Check that the two arrays are the same
		assertArrayEquals(expectedArray, actualArray);
	}
	
	@Ignore       //The following test will be ignored
	@Test (timeout = 1000)
	public void testindefiniteLoop (){
		int i = 0;
		for (; ;){         //An indefinite loop which will break after 1000ms
			i++;
			System.out.println(i + " This is an indefinit loop");
		}
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testException (){
		int a = 8, zero =0;	
		int ex = zero/a;
	}
}
