package Basics;

public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {

		case 'A':
			System.out.println("A grade");
			break;
		case 'B':
			System.out.println("B grade");
			break;
		case 'C':
			System.out.println("C grade");
			break;
		case 'D':
			System.out.println("D grade");
			break;
		default:
			System.out.println("Failed");
			break;
		}
	}

}
