package Strings;

public class Basics {
	
	public static void main(String[] args) {
		
		String name = "UshaSree";
		
		String name2 = "UshaSree";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name);
		System.out.println(name.charAt(1));
		
		String name3 = new String("UshaSree");
		String name4 = new String("UshaSree");
		
	boolean str = name.equals(name3);
	
	System.out.println(str);
	
	if(name == name3) {
		System.out.println("true");
	}
	else
		System.out.println("false");
		
		
		
		
		
	}

}
