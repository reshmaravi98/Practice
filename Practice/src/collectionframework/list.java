package collectionframework;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		
		ArrayList<String>l=new ArrayList<>();
		l.add("Hi");
		l.add("Hello");
		l.add("Hola");
		l.add("Vanakkam");
		System.out.println(l);
		for(String x:l) {
			System.out.println(x);
		}
		l.remove(1);
		System.out.println(l);
	
	}

	
	/*Add
	 * Remove
	 * Retrieve -for each/ enhanced for loop
	 * 
	 * */
}
