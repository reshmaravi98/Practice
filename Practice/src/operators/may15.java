package operators;

public class may15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *
1.Find area of semicircle using nonstatic method and return its result
2. Find largest of four numbers 
3. Print 7th table using for loop
4. Print odd numbers fro 9 to 99 using while loop
5. Print even numbers from 70 to 80 using do while loop
6. Print your details using static method 
7. Find area of circle using constructor
8. Find average of two numbers using nonstatic method and return its result
 * 
 * */
		may15 obj=new may15();
		System.out.println("Area of semi circle is: "+ obj.semi());
		may15.large();
		may15.seven();
		may15.odd();
		obj.even();
		may15.details();
		System.out.println("Average of two numbers is: "+obj.avg(5, 10));
		
	}
	//area of semi
	public double semi() {
		double r=2;
		return (3.14*r*r*0.5);
	}
	
	//largest of 4 numbers
	public static void large() {
		int a=58;
		int b=76;
		int c=88;
		int d=79;
		if(a>b && a>c && a>d) {
			System.out.println("A is the largest number");
		}
		else if(b>a && b>c && b>d) {
			System.out.println("B is the largest number");
		}
		else if(c>a && c>b && c>d) {
			System.out.println("C is the largest number");
		}
		else {
			System.out.println("D is the largest number");
		}
	}
	
	//7th table with for loop
	public static void seven() {
		System.out.println("7 Tables is as follows");
		for(int i=7; i<=70; i=i+7) {
			System.out.println(i);
		}
	}
	
	//odd numbers 9-99
	public static void odd() {
		int i=9;
		System.out.println("Odd numbers from 9-99 is: ");
		while(i<=99) {
			System.out.println(i);
			i=i+2;
		}
	}
	
	//even numbers 70-80 - do-while
	public void even() {
		System.out.println("Even numbers from 70-80 is: ");
		int i=70;
		do{
			i=i+2;
			System.out.println(i);
		}
		while(i<=80);
	}
	
	//details using static method
	public static void details() {
		String name="Reshma";
		char i='R';
		int age=24;
		String surname="Franiyo Anton";
		System.out.println("Hi, My name is "+name+ " "  +i+ ", I'm " +age+ " now and My partner is "+surname);
		
	}
	
	//area using constructor
	public may15() {
		double area=3;
		System.out.println("Area of circle is: "+ 3.14*area*area);
	}
	
	//average of 2 numbers in non-static and return
	public double avg(double a, double b) {
		double c=((a+b)/2);
		return c;
	}
}
