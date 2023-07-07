package Basics;

public class stat {

	public static void main(String[] args) {
		stat.circle(2);
		stat.add3(3, 6,11);
		System.out.println("Product of 2 numbers is: " +stat.product(4, 2));
		System.out.println("Area of square: " +stat.square());
		stat.semi(2);

	}
/*
 * 
 * Find area of circle using static method            (use void)
Find addition of three numbers using static method  (use void)

Find product of two numbers and return its result (int or double datatype)
find area of square and  return its result         (float )

Find area of semicircle using static method( use parameters , returntype is void)
Find division of two numbers using static method(use parameters, returntype is void)
 * 
 * */
	
	public static void circle(int r) {
		System.out.println("Area of circle is: " + (3.14*r*r));
	}
	public static void add3(int a,int b,int c) {
		System.out.println("Addition of 3 numbers is: "+(a+b+c));
	}
	
	public static int product(int d,int f)
 {
		return d*f;
 }
	public static float square()	{
	float area=6f;
	return area*area;
}

	public static void semi(int radius) {
		System.out.println("Area of semicircle is: "+ (3.14*0.5*radius*radius));
		
	}
	
	public static void divi(int t,int s) {
		System.out.println("Division of 2 numbers is: "+ t*s);
	}
	
}
