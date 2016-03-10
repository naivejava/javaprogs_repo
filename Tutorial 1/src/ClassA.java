/* Multilevel Inheritance:
 *   Class A is the super class
 *   Class B inherits Class A and Class C inherits Class B, which means Class C also inherits Class A
 * 	 This is called multilevel inheritance
 * 
 */  

class A {
	
	protected int a;	// a is visible to all sub classes, also visible to all classes in the same package
	
	A (){           	//Explicit constructor - do not understand this yet
		
	}
	
	A (int Val){     	// Constructor 
		
		this.a = Val;   //Assign the value of Val to the instance variable a;
		this.a = Val + 2; //Made simple modification to experiment check-in check-out
	}
	
	public void incrementA (){   //method
		a++;			         //Increment a by 1.
	}
} //Class A ends here

/*
 * Class B is the sub class of Class A
 * Class A is the super class of Class B
 * Class B inherits all members data and methods of Class A  
 */

class B extends A {
	protected int b;
	
	B (){      // Explicit constructor 
		
	}
	
	B (int Val1, int Val2){	//Constructor
		super(Val1);       	//Call the constructor in the super class A
						 	//This must be the first statement in the constructor
						 	//If you put any statement before super(a1), it will give an error 
		this.b = Val2;
	}
	
	public void incrementB (){
		b++;		//Increment b by 1;
	}	
} //Class B ends here


/*
 * Class C is the sub class of Classes B and A
 * Class B is the super class for Class C
 * Class C is inheriting all members data and methods of Class B and A
 */

// C inherits all properties of B and A
class C extends B {
	
	private int c;
	
	C(){  //Constructor
		
	}
	
	C (int Val1, int Val2, int Val3){   //Constructor
		super (Val1, Val2);    	//This will pass on Val1 and Val2 to the constructor in class B
								//This must be the first statement in the constructor
		c = Val3;
	}
	
	public void incrementC (){
		
		incrementA();		//Call the method of Class A in Class C
		incrementB();		//Call the method of Class B in Class C
		c++;				//Increment c by 1
		
		//The protected variables, a and b, are visible in Class C because Class C inherits everything from Class A & B
		System.out.printf("\nThe values of a, b, and c are: %d, %d, %d.", a, b, c);
	}
}


public class ClassA {

	public static void main(String[] args) {
	
		C obj = new C(3, 4, 5);
		
		obj.incrementC();

	}

}
