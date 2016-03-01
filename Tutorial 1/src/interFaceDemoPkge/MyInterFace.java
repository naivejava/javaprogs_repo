package interFaceDemoPkge;

/*
 * Interview Notes for Interface:
 * 1: All interfaces are by default public abstract
 * 2: All methods in the interface MUST be public abstract
 * 3: All methods in the interface MUST be declared public abstract with NO IMPLEMENTATION
 * 3: All methods in the interface MUST implemented in the child child class
 * 4: All instance variables MUST be public static final and MUST be initialized to a VALUE
 * 5: No constructors are allowed in the Interface, because all variables are already initialized, so constructors are not needed
 */

//Only public abstract modifiers are allowed to define an interface

// interface MyInterFace {    -- This definition is also valid, it is by default public abstract
//                       }

public abstract interface MyInterFace {		//The keyword interface is used instead of a class
	
											//The following four statements are equal
	double x1 = 89.6;              			//Valid, by default it is public static final and must be initialized
	public double x2 = 45.67;   			//Valid, by default it is public static final and must be initialized
	public static double x3 = 45.67;   		//Valid, by default it is public static final and must be initialized
	public static final double x4 = 45.67;  //Valid, by default it is public static final and must be initialized
											//Private, protected, volatile, and transient are not allowed
	
//	private y = 67;         //Invalid
	
	////////////// Methods definitions ////////////////////////
	// Modifiers public, abstract, default, static are permitted
	
	//The following four methods do not require body and return type
	//They MUST be implemented in the child class
	void addNum();
	public void subNum();
	public abstract void divNum();		//The keyword abstract is not necessary, it is by default abstract
	public abstract void multNum();
	
	//The following methods require body and/or return type
	//They may or may not overridden in the child class
	
	public static void ccNum(){		//just body required, no return type due to void
		
	}
	
	default int ddNum(){		//Body and return type both required 
		int x = 0;
		
		x = x + 1;
		
		return x;
	};


	
	
	
	
	
	
	
	

}
