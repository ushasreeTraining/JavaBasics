package Strings;

public class StringsImmutable {

	public static void main(String[] args) {

		String name = "usha";
		System.out.println(name);

		name = "Snoopy";
		System.out.println(name);

		name = "usha";
		System.out.println(name.concat("boomer"));
		
		System.out.println(name.toLowerCase());

	}

}
