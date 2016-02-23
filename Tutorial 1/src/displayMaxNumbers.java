// Two ways to import the package, relational.* will import all classes within the package
// relational.CompareTwoNumbers will import only the CompareTwoNumbers class.
// The relational package, which is a user-defined package, is stored in the relational directory

import relational.CompareTwoNumbers;

public class displayMaxNumbers {

	public static void main(String[] args) {
		
		CompareTwoNumbers comp = new CompareTwoNumbers(); 
		
		int maxVal;
		
		maxVal = comp.getMax(56, 567);
		
		System.out.println("The maximum value is: " + maxVal);	

	}
}
