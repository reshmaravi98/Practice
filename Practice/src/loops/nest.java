package loops;

public class nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=70;
		int b=67;
		int c=590;
		
		if(a<b && a<c) {
			System.out.println("A is the smallest value");
		}
		else if(b<a && b<c) {
			System.out.println("B is the smallest value");
		}
		else 
		{
			System.out.println("C is the smallest value");
		}
		
		int age=18;
		
		if(age>18) {
			System.out.println("Major");
		}
		
		else if(age<18) {
			System.out.println("Minor");
		}
		else {
			System.out.println("Age is 18");
		}
		
	}

}
