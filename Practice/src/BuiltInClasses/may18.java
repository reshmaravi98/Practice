package BuiltInClasses;
import java.util.Scanner;

public class may18 {

	public static void main(String[] args) {
		may18 n=new may18();
		n.prac();

	}

	public void prac() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your First name");
			String name= sc.nextLine();
			System.out.println("Enter your last name: ");
			String name1= sc.nextLine();
			System.out.println("Enter your age");
			int age=sc.nextInt();
			
			System.out.println("Your full name is " +name + " " +name1 +" and your age is " +age);
		}
		
		
	}
	
	
}
