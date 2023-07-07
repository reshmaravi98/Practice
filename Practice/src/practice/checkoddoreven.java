package practice;

import java.util.Scanner;

public class checkoddoreven {

	
	public static void main(String[] args) {
		
		System.out.println("Enter your number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		if(a%2==0) {
			System.out.println("Number is even");
		}
		
		else {
			System.out.println("Number is odd");
		}
	}
}
