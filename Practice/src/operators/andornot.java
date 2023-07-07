package operators;

public class andornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=25;
		System.out.println(a>18 ? "major" : "minor"); //Logical operator 
		
		int b=60;
		int c=90;
		System.out.println("AND");
		System.out.println(b>=50 && c==90);
		System.out.println(b<=50 && c==90);
		System.out.println(b==50 && c<=80);
		System.out.println(b<=45 && c>=100);
		
		
		System.out.println("OR");
		System.out.println(b>=50 || c==90);
		System.out.println(b<=50 || c==90);
		System.out.println(b==60 || c<=80);
		System.out.println(b<=45 || c>=100);
		
		
		System.out.println("NOT");
		System.out.println(b==60);
		System.out.println(b!=60);
	}

}
