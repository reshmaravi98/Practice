package globalvariable;

public class g1 {

	 static int a=25;
	 String name="Reshu";
	public static void main(String[] args) {
		
		g1.abc();
		g1 ob=new g1();
		ob.cd();
		
	}

	
	public static void abc() {
		System.out.println(a);
		//System.out.println(name);
	}
	
	public void cd() {
		System.out.println(a);
		System.out.println(name);
	}
}
