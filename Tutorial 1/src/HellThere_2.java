import java.util.Scanner;

/* In this demo, another class and a method is declared. 
 * The object was defined in the main() method and the preLessons() method was called in the main() method.
 */

class javaPrelim_Lessons {
	
	int i, j, k, count;
	
	byte myByte;
	short myShort;
	int myNum;
	float myFloat;
	long myLong;
	double myDouble;
	boolean myBoolean;
	char myChar;
	String firstName, lastName, myAddress;
	
	public void prelim_Lessons (){
		
		myByte = 78;
		myShort = 675;
		myNum = 9876;
		myFloat = 834269.7f;
		myLong = 76543L;
		myDouble = 67543.987;
		myBoolean = false;
		myChar = 'K';
		String firstName, lastName, myAddress;
		firstName = "Kamal"; lastName = "Muhammad"; 
		myAddress = "57 Murray Street, Fawkner, VIC, 3060";
		
		System.out.println("This is my first Java program");
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
		
		//myString contains two strings
		String myString = "This is the first line. \n This is the second line";
		
		Scanner input = new Scanner(myString);
		//Print the first string
		System.out.println("First string is: " + input.nextLine());
		
		//Print the second string
		System.out.println("First string is: " + input.nextLine());
		
		input.close();
	}
	
}

/*
 * Define the object here and call the preLessons() method in the main() method
 */
public class HellThere_2 {
	
	public static void main(String args[]) {
		
		javaPrelim_Lessons secondLesson = new javaPrelim_Lessons();
		
		secondLesson.prelim_Lessons();		
}
	
}
