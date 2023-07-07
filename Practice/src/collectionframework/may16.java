package collectionframework;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.HashSet;

public class may16 {

	public static void main(String[] args) {
		/*
		 * 
1. Create a character  list, add elements, remove elements, retrieve element and iterate through it
2. create a string  queue, add elements, remove elements, retrieve element and iterate through it . 
3. Create a double  list, add elements, remove elements, retrieve element and iterate through it
4. create a boolean(true, false)  queue, add elements, remove elements, retrieve element and iterate through it .
5. Create a float hash  set, add elements, remove elements and iterate through it


*/
	//Create a character  list, add elements, remove elements, retrieve element and iterate through it
	ArrayList<Character>l=new ArrayList<>();
	l.add('R');
	l.add('F');
	l.add('R');
	l.add('A');
	System.out.println(l);
	l.remove(1);
	System.out.println(l.get(1));
	for(Character x:l) {
		System.out.println(x);
	}

	//Create a string  queue, add elements, remove elements, retrieve element and iterate through it . 
	ArrayBlockingQueue<String>s=new ArrayBlockingQueue<>(3);
	s.add("Apple");
	s.add("Ball");
	s.add("Cat");
	System.out.println(s);
	System.out.println(s.peek());
	s.remove("Ball");
	System.out.println(s);
	System.out.println(s.getClass());
	for(String x:s) {
		System.out.println(x);
	}

	//Create a double  list, add elements, remove elements, retrieve element and iterate through it
	ArrayList<Double>n=new ArrayList<>();
	n.add(45.89);
	n.add(872.87);
	n.add(25.09);
	n.add(17.06);
	System.out.println(n);
	n.remove(1);
	System.out.println(l.get(2));
	for(Double x:n) {
		System.out.println(x);
	}
	
	//Create a boolean(true, false)  queue, add elements, remove elements, retrieve element and iterate through it .
	ArrayBlockingQueue<Boolean>b=new ArrayBlockingQueue<>(2);
	b.add(true);
	b.add(false);
	System.out.println(b);
	
	//Create a float hash  set, add elements, remove elements and iterate through it
	HashSet<Float>f=new HashSet<>();	
	f.add(5.6f);
	f.add(9.5f);
	f.add(89.28f);
	System.out.println(f);
	
	f.remove(89.28f);
	System.out.println("The element present in Hashset is: " +f);
	
	for(Float x:f) {
		System.out.println(x);
	}
	}
}
