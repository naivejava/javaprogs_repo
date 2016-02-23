/* Hierarchical Inheritance
 * ========================
 * In this type of inheritance, there is only one super class and many sub classes
 * All sub classes inherits the properties of the same super class
 */

class SuperClassShoes {
	
	protected void infoShoes (){    //method
		
		System.out.println("I am shoes and I have different types");
	}
}

class SubClassLadyShoes extends SuperClassShoes {
	
	public void ladyShoes (){       //method
		infoShoes ();
		System.out.println("One of the types is ladies shoes.");
		System.out.println("Another type is the girls shoes.\n");
	}
}

class SubClassMenShoes extends SuperClassShoes {
	
	public void menShoes(){           //method
		infoShoes ();
		System.out.println("Another type is the men's shoes.");
	}
}

public class Shoes {

	public static void main(String[] args) {                //method
	
		SubClassLadyShoes ladies = new SubClassLadyShoes(); //The constructor of the super class is executed
		ladies.ladyShoes();
		
		SubClassMenShoes mens = new SubClassMenShoes(); //The constructor of the super class is executed
		mens.menShoes();
	}
}
