package Basics;

public class m2 {

	public static void main(String[] args) {

		m2.area();
		System.out.println("Average of two numbers b&c is: "+ m2.average());
		System.out.println("Average of 3 numbers is: "+m2.three());
	
	}

	public static void area() {
		int a=4;

		System.out.println("Area of square is: " +a*a);
	}
	
	private static double average() {
		double b=3;
		double c=6;
		double d=(b+c)/2;
		return d;
	}
	
	public static int three() {
		int x=10;
		int y=20;
		int z=40;
		int avg=(x+y+z)/3;
		return avg;
	}

}
