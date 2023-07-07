package multithreading;

public class multhread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multhread t=new multhread();
		Thread ob=new Thread(t);
		ob.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run this statement");
	}

}
