package inheritance;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child.cs();
		child c=new child();
		c.cn();
		child.ps();
		c.pn();
		
		
	}
	
	public static void cs() {
		System.out.println("Child static class example");
	}
	
	public void cn() {
		System.out.println("Child non static class example");
	}

}
