/*
 * Demo of Polymorphism and Polymorphic Array
 * Hierarchical Inheritance: One super class and multiple sub classes
 * 
 */

// Father has two methods
class Father {
	
	public void myFather (){
		
		System.out.println("I am a father with two children");
		
	}
	
	//Since this methods is overridden in the child classes, the functions of this method will be ignored 
	public void Child (){
		System.out.println("We live with our mother.");
	}
}

class Child1 extends Father{
	
	//Method overrides the method in the parent class  -- Polymorphism
	public void Child (){
		
		System.out.println("I am the first child and my name is Zak.");
	}
	
}

class Child2 extends Father{
	
	//Method overrides the method in the parent class  -- Polymorphism
	public void Child(){
		System.out.println("I am the second child and my name is Haris.");
	}
}

public class PolymorphicArray {

	public static void main(String[] args) {

		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		ch1.Child();
		ch2.Child();
		
		//Another way of doing this is to create a polymorphic array;
		// An array of two objects of the parent class is created
		Father[] fa = new Father[2];     // --- fa is now an array of two objects
		
		fa[0] = new Child1();			// fa holds two different objects
		fa[1] = new Child2();
		
		System.out.println("\nDisplay the reslut after calling the methods in the polymorphic array\n");
		for (int i = 0; i < fa.length; i++){
			
			fa[i].Child();          //Note: The parent object is accessing the Child methods
		}
		

	}

}
