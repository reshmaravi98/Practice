package Basics;

public class sns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is: "+sns.area(2));
		sns o=new sns();
		System.out.println("BMI is: "+ o.bmi(1.66, 60.1));
	}

	public static double area(double a) {

		return 3.14*a*a;
	}
	
	public double bmi(double height, double weight) {
		double b= (weight/(height*height));
		return b;
	}
	
	public sns() { 
		System.out.println("Hi this is a constructor");
	}
}
