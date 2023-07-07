package overloading;

public class co {

	public static void main(String[] args) {
		
		co ob=new co();
		co ob1=new co(3);		
		
	}

	public co() {
		
		System.out.println("Default constructer");
		
	}
	
	public co(int a) {
		System.out.println("Area of square: " + a*a);
	}
 	
	
}
