package assignments;

import java.util.Scanner;

public class FirstTenMultiples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int multiple = num * i;
			System.out.println(num + " * " + i + " = " + multiple);
		}

	}

}
