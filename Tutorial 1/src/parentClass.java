/* The methods in this class will be inherited in another class, and the multiply() method will be overridden
   in the subClass.
 * 
 * Called in subClass.java
 * =======================
   This class is also called: super class, parent class, or base class.
   
*/ 
public class parentClass {
	
	//Add two integer numbers
	public void addNumbers (int x, int y){
		
		int z = (x + y);
		System.out.printf("\nThe sum of two numbers in the parent class is: %d\n", z );
	
	}
	
	//Multiply two numbers
	public void multiply (int x, int y){
			
		int z = (x * y);
		System.out.printf("\nThe multiplication of two numbers in the parent class is: %d\n", z);
	
	}
}

