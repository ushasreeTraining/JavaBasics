package assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String reverse = sc.nextLine();
		StringBuffer sb = new StringBuffer(reverse);
		sb.reverse();
		System.out.println("Actual Sentence in reverse: " + sb);
		System.out.println("Sentence in Lower case: " + reverse.toLowerCase());
		System.out.println("Sentence in Upper case: " + reverse.toUpperCase());
	}

}
