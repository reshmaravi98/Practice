package practice;
import java.util.ArrayList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> a=new ArrayList<>();
		a.add('a');
		a.add('e');
		a.add('i');
		a.add('o');
		a.add('u');
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		
		for(Character x:a) {
			System.out.println(x);
		}
		
	
	}

}
