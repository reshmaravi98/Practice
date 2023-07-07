package BuiltInClasses;
import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		avg a=new avg();
		a.average();
		
		
	}

	
	public void average() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers for finding average: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d = ((a+b+c)/3);
		System.out.println("Average of three numbers is: " +d);
		
	}
}
