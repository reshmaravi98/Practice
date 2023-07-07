package BuiltInClasses;

public class strclass {

	public static void main(String[] args) {
		
	
		String s="Hello";
		System.out.println(s.length());
		System.out.println(s.indexOf('e'));
		System.out.println(s.charAt(4));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.replace('e', 'o'));
		
		System.out.println(s.concat("hola"));
		System.out.println(s+"hola");
		
		System.out.println(s.contains("ll"));

		System.out.println(s.substring(1, 5));
	}

}
