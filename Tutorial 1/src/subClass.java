/* OVERRIDDING and BASIC INHERITANCE
 * =================================
 * 
 * Method overriding is also called runtime polymorphisim.
 * 
 * Basic Inheritance or Single Inheritance: 
 * This type of inheritance contains one super class and one sub class
 * 
 * The subClass inherits all member data elements and member methods of the parentClass
 * The subClass is called a child class, derived class, or sub class.
 *
 *Concept of OVERRIDDING is also demonstrated
 *
 *Note :- Constructors cannot be overridden.
           Static and Final methods cannot be overridden.
           Method Overriding implements runtime polymorphism in Java.
           private methods cannot be overridden since they cannot be inherited. 
*/

//Inherits members of the parentClass.java

public class subClass extends parentClass {
	
	/*The multiply() method is defined in the parentClass as well as in the subClass 
	 * The entire header of the method here is the same including the number and type of parameters
	 * The only difference is that the function within the multiply() method is different. 
	 * When we access this method, the function of this method will take precedence.
	*/
	
	
	@Override         //This is called annotation
	public void multiply(int x, int y) {  //Compare the header with the parentClass multiply() method, all the same
		int z = 0;
		z = (x/y);
		System.out.printf("\nThe division of two numbers of the overridden method is: %d\n", z);
	}
	
	//main() method
	public static void main (String[] args){
		
		//Create an object
		subClass ov = new subClass();
		
		//Inherit all methods of the parent class and access them here
		ov.addNumbers(5, 5);
		
		/* This method is overridden, the numbers are divided instead of multiplication, the result would be 1
		   rather than 36 */
		ov.multiply(6, 6);
		
		//Notice that an object is created from the parentClass here 
		parentClass or = new parentClass();
		or.addNumbers(40,  40);	
	}
	
}








