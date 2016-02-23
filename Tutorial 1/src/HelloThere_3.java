import java.util.Scanner;

/* Demo of encapsulation. All variables are private to the class, 
 * they cannot be initialized or accessed in the main() method.  
 */

/* Demo of static variable */


// tomorrow lesson: final, static. this, constructor.

//Notes: The constructor name and the class name must be the same;
//Once an object of a class is created, the constructor runs automatically, and initialized variables or run statements, 
// 
// Static variable is accessed by the name of the class, not by the name of an object. They are called class variables
// Variable of type final static must be initialized at the time of declaration
// Not values can be assigned to these variables later on, they are like fixed constants




class javaPvt_Lessons {
	// Variables are declared as private, means they cannot be accessed outside this class
	private String firstName;
	private String lastName;
	private int Age;
	
// Decalred public cos I want to access these vars in the main() method
	public String permAddress;
	public static String tempAddress;
	
	public void pvt_Lessons (String myFirstName, String myLastName, int myAge ){
	
		firstName = myFirstName;
		lastName = myLastName;
		Age = myAge;
		
		System.out.println("\nPersonal details: \n");
		System.out.println("My name is: " + firstName + " " + lastName + " and I am " + Age + " years old.");
	}
	
}

public class HelloThere_3 {
	
	public static void main(String args[]) {
		
		javaPvt_Lessons pvtLesson = new javaPvt_Lessons();
		
		// Accessing firstName here in the main() method will give an error, because it is privately declared
		// pvtLesson.fisrtName = "Kamal";
		
		// pvt_Lessons () method is called here
		pvtLesson.pvt_Lessons("Kamal", "Muhammad", 54);
		
		//Access the two public variables
		
		pvtLesson.permAddress = "57 Murray Street, Fawkner, VIC, 3060";
		
		//This type of access gives a warning, it should be accessed in a static way
		pvtLesson.tempAddress = "564 Woylie Place, Campbellfield, NSW, 2987";
		
		System.out.println("Permanant Address: " + pvtLesson.permAddress);
		System.out.println("\nNon-static way to print the permanant address: " + pvtLesson.tempAddress);
		
		// In this case, the class name javaPvt_Lessons is used to access the variables in a static way
		// No warning is generated
		javaPvt_Lessons.tempAddress = "564 Woylie Place, Campbellfield, NSW, 2987";
		System.out.println("\nStatic way to print the permanant address: " + javaPvt_Lessons.tempAddress);
		
		
}
	
	
}
