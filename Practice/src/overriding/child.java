package overriding;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
		child c=new child();
		
		c.area();
		p.area();
		
		

	}

	public void area() {
		int l=6;
		int b=8;
		System.out.println("Area of rectangle is: "+ l*b);
	}
}
