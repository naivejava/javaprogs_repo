package JavaKnowledge;

public class testClass1 {

	private String str1;
	private String str2;
	
	public boolean strMethod(String str1, String str2){
		
		this.str1 = str1;
		this.str2 = str2;
		
		if (str1 == str2){
			return true;
		}
		else{
			
			return false;
		}
	}
}
