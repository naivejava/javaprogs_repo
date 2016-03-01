package interFaceDemoPkge;

/*
 * Interview Notes: 
 * 1: All methods of MyInterFace interface are overridden here in the child class
 * 2: The keyword abstract is removed from the methods in the child class
 * 3: Every class by default extends the Object class
 * 
 * So the following statements are the same:
 * 
 * public class InferfaceDemo extends Object implements MyInterFace{
 * public class InferfaceDemo implements MyInterFace{
 * 
 */

public class InferfaceDemo implements MyInterFace{

	@Override
	public void addNum() {
		System.out.println("This method is adding numbers");

	}

	@Override
	public void subNum() {
		System.out.println("This method is subtracting numbers");
	}

	@Override
	public void divNum() {
		System.out.println("This method is dividing numbers");
	}

	@Override
	public void multNum() {
		System.out.println("This method is multiplying numbers");
	}

public static void main(){
	
	InferfaceDemo id = new InferfaceDemo();
	
	id.addNum();
	id.divNum();
	id.subNum();
	id.multNum();
	
	
}
	
	
}

