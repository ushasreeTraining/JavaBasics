package assignments;

import java.util.Scanner;

public class EvenOddWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min. number: ");
		int min = sc.nextInt();
		System.out.println("Enter max. number: ");
		int max = sc.nextInt();
		int i = min;
		while (i <= max) {
			if (i % 2 == 1) {
				System.out.println(i + " is odd number");
			} else {
				System.out.println(i + " is even number");
			}
			i++;
		}

	}

}
