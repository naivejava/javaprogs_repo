//Demo of ambiguous overloading

public class ambiguousOverLoading {

	private double multiply(int x, double y){
		
	   return (x * y);
	   
	}
	
	private double multiply(double x, int y){
		
		   return (x * y);
		}
	
	public static void main(String[] args) {

		ambiguousOverLoading amd = new ambiguousOverLoading();
		
		amd.multiply(5.4, 3); //The compiler will call the second method
		
		amd.multiply(3, 5.4); //The compiler will call the first  method
		
//		amd.multiply(5, 3); //This is ambiguous for the compiler which method to call
							//To avoid this situation, define another method with int parameters
		

	}

}
