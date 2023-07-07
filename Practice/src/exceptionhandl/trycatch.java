package exceptionhandl;

public class trycatch {

	public static void main(String[] args) throws ArithmeticException{
		
		try{
			System.out.println(16/0);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		
		finally {
			
			System.out.println("Always printed with or without error");
		}
		
		
	}

}
