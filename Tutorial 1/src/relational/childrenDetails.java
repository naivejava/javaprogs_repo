package relational;

import relational.subpge.*;

//The childrenDetails class inherits the properties of the class subPkge
// There is one instance variable (address), one constructor, and one method (subPkgeMethod) in the subPkge class
public class childrenDetails extends subPkge{
	public void displayDetails(String fName, String lName){
	    
		//Access the subPkgeMethod() method of the subPake class in here without creating an object
		
			subPkgeMethod();
		
		//Access the instance variable (Address) of the subPkge class in here
		System.out.printf("%s\t %s %s", fName, lName, Address);
		
	}
	
	
}
