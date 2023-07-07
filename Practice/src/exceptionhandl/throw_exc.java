package exceptionhandl;

import java.util.Scanner;

public class throw_exc {

public static void main(String[] args) {
	
	
	Scanner s=new Scanner(System.in);
	int age= s.nextInt();
	if(age<18) {
	throw new ArithmeticException("Age is minor");	
	}
	else 
	{
		System.out.println("Major");
	}
}	
	
}
