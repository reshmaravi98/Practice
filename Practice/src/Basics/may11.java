package Basics;

public class may11 {

	public static void main(String[] args) {
		System.out.println("Perimeter of rectangle is: " +may11.rect(45, 35));
		may11 o=new may11();

		System.out.println("Average of three numbers is: " +o.avg(5, 6, 7));
	

	}
/*
 * Find perimter of rectangle using static method  and return its result(use parameter)
Find average of four numbers using nonstatic method and return its result (use parameter)
Find product of three numbers using constructor
 * */
	public static int rect(int l,int b) {
		return l+b;
	}
	
	public int avg(int a,int b,int c) {
		return ((a+b+c)/3);
	}
	
	public may11() {
		int a=2;
		int b=4;
		int c=3;
		System.out.println("Product of 3 numbers is: "+ (a*b*c));
	}
}

