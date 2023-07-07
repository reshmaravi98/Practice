package practice;

import java.util.Scanner;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload o=new overload();
		o.details("Reshma", 17);
		o.details("Reshu", "TCS");
		
	}

	public void details(String name, int id) {
		
		System.out.println("Name is "+name+ " and id is: "+id);
	}
	
	public void details(String name,String company_name) {
		
		System.out.println("Name is: "+name+ " Company name is: "+company_name);
	}
}
/*
 * Scanner s=new Scanner(System.in);
		name= s.nextLine();
		Scanner s2=new Scanner(System.in);
		id=s.nextInt();*/
