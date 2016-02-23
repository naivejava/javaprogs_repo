import testpackage.myClass;

//There is a sub package under the relational package.
//Another sub directory, subpge, has been created under the relational directory 
import relational.*;

public class App {

	public static void main(String[] args) {
	
	//myClass belongs to testpackage;
	myClass testPackage = new myClass();
     
    //myClassMethod has been defined in the testpackage. 
     testPackage.myClassMethod();
     
    // subPkge pkg2 = new subPkge();
    
   // pkg2.subPkgeMethod("Kamal", "Muhammad");
     
 //    childrenDetails c = new childrenDetails();
     
  //   c.displayDetails("Muhammad", "Kamal");
     
  //   c.getChildFirstName("Aamir");
    // c.getChildLastName("Kamal"); 
   
     
 	pbPrProVar j = new pbPrProVar();
 	
 	System.out.printf("\n %s\n %s\n %s ", j.pubName, j.prtName, j.strName);
 	
 	j.pubName = "Sher Zameen Khan";   // CAN access the public variable
// 	j.pvtName = "Sher Zameen Khan";   // CANNOT access the private variable
 	j.prtName = "Sher Zameen Khan";   // CAN access the protected variable here because both classes are in the same package
 									  // If the App and pbPrProVar classes in different packages, then the protected variable CANNOT be accessed
 	j.strName = "Sher Zameen Khan";   // CAN access the public variable
 									  // If the App and pbPrProVar classes in different packages, then the no modifier variable CANNOT be accessed
	}  // main() ends here
	
	
	
}
