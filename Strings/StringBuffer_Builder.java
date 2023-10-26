package Strings;

public class StringBuffer_Builder {
	
	public static void main(String[] args) {
		
		//Diff b/w string buffer and stringBuilder
		//String Buffer - synchronized, thread safe and less efficient
		//String builder - not thread safe but more efficient
		
		StringBuffer sb = new StringBuffer("Welcome");
		sb.append(" Home");  //welcome Home
		sb.insert(7, " to"); //welcome to home
		sb.replace(8, 10, "to our"); //welcome to our home
		sb.delete(7, 19); //Welcome
		sb.reverse();  //emoclew
		System.out.println(sb); //welcome home
		
		
	}

}
