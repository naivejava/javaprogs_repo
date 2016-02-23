// class with a method encapsulated in it

class maxNumbers {
	
	int j = 0;
	
	// The getMax method is encapsulated within a class
	// The getMax will return a maximum value
	public int getMax (int x, int y){
		
		if (x > y ){
			return x;
		}
		else {
			return y;
		}
	}

}

// The name of the file will be CompareNumbers.java which will be stored in the relational directory
public class CompareNumbers {
	//main method
	public static void main(String[] args) {
		
		int maxValue = 0;
		// define the object
		maxNumbers maxInt = new maxNumbers ();
        
		// accessing of a variable in a class, j is declared in maxNumbers class 
		maxInt.j = 56; 
		
        System.out.println("The value of j is: " + maxInt.j);
		
		// access the getMex method and pass on the two parameters
		maxValue = maxInt.getMax(99, 87);
		
		System.out.println("The maximum value is: " + maxValue);
	}

}
