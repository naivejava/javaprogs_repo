package relational.subpge;

// Demo of a Sub Package 
public class subPkge {
	
   public String Address;
	
     //Constructor to initialize the address
	public subPkge (){
		Address = "45 Murray Street, Fawkner, VIC, 7865.";		
	}

	public void subPkgeMethod(){
		System.out.println("\nYour details are as follow:");
		System.out.println("\nFirst Name\t Last Name  \tAddress");
//		System.out.printf("%10s\t %s %s", firstName, lastName, Address);
	}
}
