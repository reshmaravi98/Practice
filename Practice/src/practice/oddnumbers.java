package practice;

import java.util.Scanner;

public class oddnumbers extends add_abstract{

	public static void main(String[] args) {
		
		//odd number from 5-55
		
		for(int a=5;a<=55;a=a+2) {
			System.out.println(a);
		}
		
		oddnumbers o=new oddnumbers();
		o.add();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter number 1: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Enter number 2: ");
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		System.out.println("Addition of two numbers is: "+ (a+b));
	}
}
