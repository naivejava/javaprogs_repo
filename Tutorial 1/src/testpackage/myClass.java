package testpackage;

//In this example, the testpackage contains one class and one method and it is stored in the testpackage directory.
//Interview Notes: The classes within the package CANNOT have a "private" modifier.
// Only public, abstract, or final modifiers are allowed for classes
//The testpackage has been imported in the APP.java class
public class myClass {
	
	//Interview Notes: The methods CAN have a private modifier but then it will NOT be visible outside this class.
	public void myClassMethod(){
		System.out.println("This method belongs to a testpackage");
	}

		
}
