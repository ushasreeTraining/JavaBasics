package assignments;

import java.util.Scanner;

public class EvenOddForLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Min. number: ");
		int min_num = sc.nextInt();
		System.out.println("Enter Max. num: ");
		int max_num = sc.nextInt();
		for (int i = min_num; i <= max_num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even Number");
			} else
				System.out.println(i + " is Odd Number");

		}
	}
}
