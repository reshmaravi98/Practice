package Basics;

public class nstatic {

	public static void main(String[] args) {
		nstatic obj= new nstatic();
		obj.name();
		obj.division();
		System.out.println("Addition of 2 numbers is: "+obj.add());
		System.out.println("Details is: "+obj.details());
		
		nstatic.multiply(3,4.2f);
		obj.details1(24,"Reshma",'F'); //void method - no need to call in sysout
		

	}

	public void name() {
		String name= "Reshma";
		int age=24;
		System.out.println("Name is "+name+ " and her age is " +age);
	}
	
	private void division() {
		int a= 10;
		float b=5f;
		System.out.println("Division of two numbers is: "+ a/b);
		
	}
	
	public int add() {
		int f=35;
		int r= 45;
		return f+r;
	}
	
	private String details() {
		String name="Reshma";
		return "hi " + name;
	}
	
	public static void multiply(int c,float d) {
		System.out.println("Product of 2 numbers is: "+ c*d);
	}
	
	private void details1(int age,String name, char sex) {
		System.out.println("Age is: "+age+ " and name is "+name+ "And "+sex);
	}
}
