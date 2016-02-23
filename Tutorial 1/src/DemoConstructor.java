//==================================================================
// Demo of "this"
class demoThis{
		
	public String myName = "Kamal Muhammad";
	public int myAge = 45;
		
	public void demoOfThis(){
		    //Interview Notes: Since variables, myName and myAge are the same as the instance variables, therefore use the keyword "this" 
		    // to refer to the variables myName and myAge of the method, demoOfThis.
		    
			this.myName = "Alam Khan";
			this.myAge = 67;
			System.out.println("\nYour name is " + this.myName + " and you are " + this.myAge + " years old.");
		}
	}

//===============================================================================
//Next lesson: static method using static and non-static variables, invoking a static method

// Demonstration of a constructor
public class DemoConstructor {
	
	//static variable
	public static int count = 0;
	
	// Interview Notes: The variable CONSTANT_VALUE must be initialized here
	// Generally constants are declared as public so that they are available to other  
	// classes and methods
	public static final float CONSTANT_VALUE = 89.67f;
	// Interview Notes: The class name and the constructor name are the same
	// The constructor method has only one keyword, public
	private DemoConstructor() {
		count++;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The value of count before the object: " + DemoConstructor.count);
		
		/*Changing the value of CONSTANT_VALUE will give an error
		   CONSTANT_VALUE = 654;     ---- This is not allowed
		*/
		
		//create an object
		DemoConstructor democonst = new DemoConstructor();
		
		//No need to call the DemoConstructor, it will run by itself when the democonst object is created
		System.out.println("\nThe value of count after the object: " + DemoConstructor.count);
		
		demoThis demo1 = new demoThis();
		
		demo1.demoOfThis();
		
	}

}
