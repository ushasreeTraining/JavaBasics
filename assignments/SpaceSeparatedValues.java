package assignments;

import java.util.Scanner;

public class SpaceSeparatedValues {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input: ");
		int num = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Formula is: (a+2^0.b) (a+2^1.b) (a+2^2.b) (a+2^3.b) … (a+2^n.b) ");
		for (int i = 0; i <= num; i++) {
			long result = (long) Math.pow(2, i);
			
			//System.out.print("2^" + i + "=" + " " + result);
			System.out.print(" " + result);
			//System.out.println(" " + "* " + b);

		}
	}

}
