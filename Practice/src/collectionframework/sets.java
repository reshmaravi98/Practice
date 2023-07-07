package collectionframework;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;



public class sets {

	public static void main(String[] args) {
		/*
		SETS
		TreeSet - ascending/alphabetical
		LinkedHashSet - 
		HashSet
		*/
		
		//retrievel not possible
		
		
		//TreeSet
		//add
		TreeSet<String>l=new TreeSet<>(); 
		l.add("Reshu");
		l.add("Fran");
		l.add("Hola");
		l.add("Hey there");
		System.out.println(l);
		//remove
		l.remove("Hey there");
		System.out.println(l);
		//loop
		for(String x:l) {
			System.out.println(x);
		}
		
		//LinkedHashSet
		LinkedHashSet<String>o=new LinkedHashSet<>();
		o.add("Reshu");
		o.add("Fran");
		o.add("Hola");
		o.add("Hey there");
		System.out.println(o);
		//remove
		o.remove("Hola");
		//loop
		for(String m:o) {
			System.out.println(m);
		}
		
		
		//HashSet
		HashSet<String>h=new HashSet<>();
		h.add("Reshu");
		h.add("Fran");
		h.add("Hola");
		h.add("Hey there");
		System.out.println(o);
		//remove
		h.remove("Hey there");
		h.remove("Hola");
		
		//loop
		for(String e:h) {
			System.out.println(e);
		}
	
	
	}

}
