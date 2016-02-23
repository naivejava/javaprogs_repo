// Method overloading Demo
// Three methods with the SAME name but different number and types of parameters
//Note that all methods are in the SAME Class
//Why we need overloading? Suppose we want to perform the same function but the data types are different
//and/or number of arguments are different, then we need method overloading.
//But all methods must be in the same class

// Since the name of each method is the same, how the compiler knows which method is to call? 
// The compiler checks the type and the number of parameters and then matches it with the method and call that method 

// Note 1: Same class and same method name -- remember for overloading. Inheritance and polymorphism is not involved
//Note 2: The return type can be different

public class overLoadingMethodDemo {

	private int add( int x, int y){
		
		return (x + y);
		
	}
	
	private double add(double x, double y){
		
		return (x + y);
		
	}
	
	private double add(double x, int y, float z){
		
	return (x + y + z);
		
	}

	private String add( String x, String y){
	String space = " ";
	return (x + space + y);
	}
	
	
	public static void main(String[] args) {
		int a;
		double b;
		double d;
		String s;
			
		overLoadingMethodDemo o = new overLoadingMethodDemo();
			
		a =	o.add(5,  9);		//Same method with two integer arguments passed
		d = o.add(6, 7.6); 		//Same method with two mixed arguments of different types passed. In this case, 
		                        //the compiler will change 66 to double and will pass them to the second method
		b = o.add(45.78, 34, 6.5f); //Same method with three arguments of different types passed
		s = o.add("Muhammad", "Kamal"); //Same method with two String arguments passed
		
		System.out.println("The addition of two integer numbers is: " + a );
		System.out.println("The addition of two double numbers is: " + d );
		System.out.println("The addition of three mixed numbers is: " + b );
		System.out.println("The concatenation of two strings is: " + s );
	}

}
