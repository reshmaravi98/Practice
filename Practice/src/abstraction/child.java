package abstraction;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c=new child();
		c.hello();
		c.hola();
	}

	@Override
	public void hola() {
		// TODO Auto-generated method stub
		System.out.println("This is a abstracted method");
	}
	
	

}
