

public class pbPrProVar {
	public String pubName;		//public modifier    - can be accessed from anywhere        
	private String pvtName;		//private modifier   - can be accessed in the same class, class level visibility
	protected String prtName;	//protected modifier - can be accessed in the same class, subclass, same package
	String strName;				//no modifier		 - can be accessed in the same package
	
		public pbPrProVar(){            		// Constructor
			this.pubName = "My name is public"; 	// Can access all the instance variables in here 
			this.pvtName = "My name is private";
			prtName = "My name is protected";
			strName = "My name is string";
		}
}

