
public class Person {

	public Person(double hours, double pay){
		if (hours > 60){
		
				System.out.println("You have worked too many hours");
		}
		else if (pay > 8.0){
				System.out.println("person must be payed atleast 8 dollars");
		}
		else if (hours > 40){
				double finalPay = hours*pay;
				double dt = (hours - 40)*(pay*1.5);
				finalPay = finalPay + dt;
				System.out.println("Final pay: " + finalPay);
			}

		}
 
	public static void main(String[] args) {
		Person a = new Person(65, 7.50);
	//	Person b = new Person(47, 8.20);

	}

}
