package collectionframework;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;

public class maps {

	public static void main(String[] args) {
		/*
		 *MAPS
		 *TreeMap (key, element) -key has a datatype and element has one datatype
		 *LinkedHashMap
		 *HashMap
		 * 
		 */

		TreeMap <Integer, String>m=new TreeMap<>();
		m.put(1, "Apple");
		m.put(5, "Egg");
		m.put(18, "Salt");
		System.out.println(m);
		
		System.out.println(m.get(5));
		m.remove(18);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		LinkedHashMap <Integer, String>n=new LinkedHashMap<>();
		n.put(1, "Apple");
		n.put(5, "Egg");
		n.put(18, "Salt");
		System.out.println(n);
		
		
		
		Hashtable <Integer, String>p=new Hashtable<>();
		p.put(1, "Apple");
		p.put(5, "Egg");
		p.put(18, "Salt");
		System.out.println(p);
	
	}

}
