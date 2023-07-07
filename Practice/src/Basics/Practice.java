package Basics;

public class Practice {

	public static void main(String[] args) {
		Practice.triangle();
		Practice.product();
		System.out.println("Addition of two numbers is: "+ Practice.add());
		System.out.println("Addition of double numbers is: "+ Practice.addition());
		System.out.println("Average of 3 numbers is: "+m2.three());
		Practice obj=new Practice();
		obj.sub();
        nstatic ob=new nstatic();
		ob.name();


	}
	
	public static void triangle() {
		int base = 3;
		int height= 5;
		System.out.println("Area of Triangle is: " + (0.5*base*height));
	
	}
	
	private static void product() {
		int n1=30;
		int n2=20;
		System.out.println("Product of 2 numbers is: "+ n1*n2);
	}
	
	public static int add() {
		int a=5;
		int b=10;
		int c=a+b;
		return c;
	}
	
	private static double addition() {
		double d=1.2;
		double e=1.3;
		double f=d+e;
		return f;
		
	}
	
	public void sub() {
		float a1=3.8f;
		float a2=1.3f;
		System.out.println("subtraction of 2 numbers: "+ (a1-a2));
	}

}
