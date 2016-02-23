import java.util.Scanner;

public class HelloThere {

	public static void main(String args[]) {
		
		// There are 8 primitive data types: byte, short, int, float, double, long, char, boolean 
		
		int i, k, count;
		
		byte myByte = 68;
		
		short myShort = 9899;
		
		int myNum = 89;
				
		float myFloat = 8987f;
		
		long myLong = 78L;
		
		double myDouble=897.89;
		
		boolean myBoolean = false;
		char myChar = 'K';
		
		// Declaring strings
		String firstName, lastName, myAddress;
		
		firstName = "Kamal";
		lastName = "Muhammad";
		myAddress = "45 Murray Street, Fawkner, VIC, 3060";	
		
		System.out.println("This is my second Java program");
		System.out.println("=============================");
		System.out.println();
		System.out.println("This is an byte number: " + myByte);
		System.out.println("This is an short number: " + myShort);
		System.out.println("This is an integer number: " + myNum);
		System.out.println("This is an floating point number: " + myFloat);
		System.out.println("This is an long number: " + myLong);
		System.out.println("This is an double number: " + myDouble);
		System.out.println("This is an boolean: " + myBoolean);
		System.out.println("This is a charater: " + myChar + "\n");
		
		System.out.println("My first name is: " + firstName + " and last name is: " + lastName + "\n");
		System.out.println("My address is: " + myAddress);
		
		//Loops
		
		for (i=0; i<3; i++){
			System.out.println("\n My address is: " + myAddress);
		}
		
		//infinite for loop
		count = 0;
		for (; ; ){
			System.out.println("This is an infinit loop but I have to break it after 10 iterations, otherwise, it will run forever!");
			++count;
			if (count > 10){
				break;
			}
		}
		
		//do-while loop
		i = 0;
		do {
			System.out.println("This is a do-while loop\n");
			++i;
		}while (i < 5);
		
		//while loop
		boolean jj = false;
		while (jj){
			System.out.println("This is while loop, priting the number: " + i);
			jj = false;
		}
		
		//Arrays - one dimension - two ways to declare arrays, pay attention to brackets
		
		int oneDimArray[] = {23, 78, 90, 78};
		
		// Can also declare an array like this
		
		int[] oneDimArray2 = {34, 65, 98, 87, 65, 45};
		
		for (k = 0; k < oneDimArray.length; k++){
			System.out.println("First Count of " + oneDimArray.length + " = " + oneDimArray[k]);
		}
		
		// Print a blank line
		System.out.println();
		
		for (k = 0; k < oneDimArray2.length; k++){
		
			System.out.println("Second Count: " + oneDimArray2[k]);
		}
		
		// Multi-dimensional arrays including 3 dimensional array, if, else-if, switch-case
		
		//Accept input from the keyboard
		
		Scanner input = new Scanner (System.in);
				
		String line;
		
		line = input.nextLine();
		System.out.println("\n You enetred: " + line);

		
		String myString = "This is the first line. \n This is the second line";
		input = new Scanner(myString);
		
		System.out.println("\n First Line: " + line);
		
		System.out.println("Will print the first line:");
		System.out.println("\n First Line: " + input.nextLine());
		
//		System.out.println("Will print the first line:");
//		line = input.nextLine();
		
		System.out.println("\n Second Line: " + input.nextLine());
		input.close();
		
}
	
}
