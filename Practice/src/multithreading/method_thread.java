package multithreading;

public class method_thread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		t.start();
	}
	
	public void run() {
		System.out.println("Thread is working");
	}

}
