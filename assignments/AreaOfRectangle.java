package assignments;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area;
		int width;
		int length;
		System.out.println("Enter Width: ");
		width = sc.nextInt();
		System.out.println("Enter Length: ");
		length = sc.nextInt();
		if (width < 0 || length < 0) {
			System.out.println("Invalid input. Width and length must be positive values.");
		} else if (width > 0 && length > 0) {
			area = width * length;
			System.out.println("Area of Rectangle is: " + area);
		} else {
			System.out.println("Width and length must be greater than 0.");
		}
	}
}