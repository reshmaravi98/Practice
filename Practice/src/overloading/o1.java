package overloading;

public class o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * Works in static,non static and constructor
 * 
 * has same methodname but difrnce in datatype, parameter or sequence
 * */
		o1.a();
		o1.a(2);

		o1.a(6.5,2.1);
	}

	
	public static void a() {
		System.out.println("Area of something");
		
	}
	
	public static void a(int b) {
		System.out.println("Area of circle: "+3.14*b*b);
		
	}
	public static void a(double b, double c) {
		System.out.println("Area of rect: "+ b*c);
	}
	
}
