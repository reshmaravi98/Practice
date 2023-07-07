package BuiltInClasses;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		/*
		 * Scanner:
		 * 
		 * Int
		 * */

		Scanner s=new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name= s.nextLine();
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		System.out.println("Enter your salary: ");
		double sal=s.nextDouble();
		
		System.out.println("Verify your details ");
		System.out.println("Your name is: "+ name+ " Age is "+age+ " And your salary is "+sal);
	}

}
