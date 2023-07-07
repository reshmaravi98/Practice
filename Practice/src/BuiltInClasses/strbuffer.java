package BuiltInClasses;

public class strbuffer {

	public static void main(String[] args) {

		
		StringBuffer s=new StringBuffer("Hello");
		System.out.println(s.length());
		System.out.println(s.indexOf("el"));
		System.out.println(s.charAt(4));
		
		System.out.println(s.replace(0,2, "sh"));

		System.out.println(s.reverse());
		System.out.println(s.delete(3,5));
		System.out.println(s.reverse());
		System.out.println(s.deleteCharAt(0));
		System.out.println(s.insert(0, "q"));
	}

}
