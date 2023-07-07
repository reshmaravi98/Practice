package Basics;

public class stati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stati.details();
		System.out.println("Address of Reshma is: "+stati.address());
		stati.salary(1800000);
		stati ob=new stati();
		ob.add();
		System.out.println("Product of two numbers is: "+ob.prod());
		System.out.println("Division of two numbers is: "+ob.divi(6,2));
		System.out.println("Area of rectangle is: "+ ob.rect(7, 3));
	}

	private static void details() {
		String name="Reshma";
		int age=24;
		System.out.println("Age of "+name+ " is: "+age);
	}
	
	public static String address() {
		String add= "Alwarthirunagar, Chennai 600087";
		return add;
	}
	
	public static double salary(double sal) {
		System.out.println("Salary of Resh is: "+sal);
		return sal;
	}
	
	public void add() {
		int a=3;
		int b=5;
		System.out.println("Addition of two numbers is: " + (a+b));
	}
	
	public double prod() {
		double f=25.9;
		double r=17.6;
		return f*r;
	}
	
	public int divi(int x,int y) {
	
		return x/y;

	}
	
	public int rect(int b,int h) {
		int g=b*h;
		return g;
	}
}
