public class stringLessons {

	private int Val1 = 89;
	private static int Val2 = 987;
	
	//The method is non-static. Both static and non-static variables declared in the class can be accessed.
	private void Testing (){
		
		// Both static and non-static variables are accessed and changed
		Val1 = 45;
		Val2 = 43;
		System.out.println("\nThis is a non-static method");
		System.out.println("You can access static and non-static variables in a non-static method \nHowever, non-static variables cannot be accessed in a static method");
		System.out.printf("The values are %d (non-static) and %d (static) \n", Val1, Val2);
		
	}
	
	private static void Testing2 (){
		
		// Val1 = 45;    ---- Cannot access Val1 because it is a non-static variable
		Val2 = 564;       // Can ONLY access Val2 because it is a static variable   
		System.out.println("\nThis is a static method");
		System.out.println("\nYou can only access static variables in a static method.");
		System.out.printf("\nThe value is %d", Val2);

	}
	
	public static void main(String[] args) {


		StringBuilder str = new StringBuilder();
		
		str.append ("My name is Muhammad Kamal. ");
		
		str.append("I live in Fawkner. ").append("I work in the IT field.");
		
		System.out.println(str.toString());
		
		//Next lesson: printf, like the in C language. Check all the formatting of the system.out.printf ...
		
		Val2 = 34;
		
		stringLessons st = new stringLessons();
		
		st.Testing();
		stringLessons.Testing2(); // Since Testing2 is static, it is accessed in a static way using the class name

	}

}
