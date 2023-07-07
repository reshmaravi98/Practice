package Basics;

public class fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	fun obj=new fun();
	System.out.println("a+b formula answer is: " +obj.ab());
		
	}
 public int ab() {
	 
	 int a= 2;
	 int b=3;
	 int sq= ((a*a) + (2*a*b) + (b*b));
	 return sq;
 }

}
