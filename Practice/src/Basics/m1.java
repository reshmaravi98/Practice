package Basics;

public class m1 {

	public static void main(String[] args) {
		m1.area();
		m1.name();
		m1.sum();

	}

	public static void area() {
		int a=4;
		System.out.println("Area of Square is : " + a*a);
	}
	
	public static void name() {
		String myname = "Reshma R";
		System.out.println("My name is : " +myname);
	}
	
	private static void sum() {
		int x= 25;
		int y=20;
		System.out.println("Addition of 2 numbers is " + (x+y));
	}
}
