
public class passByValueDemo {
	
	public int len;
	
	public static void increment(int val) {
	     val++;
	}
	
	// Method with a variable number of parameters
	private int Summation(int... Val){
		int s = 0;
			
		len = Val.length;
		
		for (int i=0; i<Val.length; i++){
			s += Val[i];	
		}
		 
		return s;	
		
	}
	
public static void main(String args[]) {
		int x = 6;
		System.out.println("Before Calling increment : x = " + x);
		
		/* call the increment method
		*/
			      passByValueDemo.increment(x);
			      System.out.println("After Calling increment : x = " + x);
			      
			      passByValueDemo sum = new passByValueDemo();
			      
			      //Variable number of arguments are passed
			      x = sum.Summation(2);
			      System.out.printf("The sum of %d numbers is: %d\n", sum.len, x);
			      
			      x = sum.Summation(5, 10);
			      System.out.printf("The sum of %d numbers is: %d\n", sum.len, x);
			      
			      x = sum.Summation(5, 9, 8);
			      System.out.printf("The sum of %d numbers is: %d\n", sum.len, x);
			      
			      x = sum.Summation(6, 7, 8, 45);
			      System.out.printf("The sum of %d numbers is: %d\n", sum.len, x);
			      
			   }

	
	
	
	}
