package Basics;

public class ContinueStatementsForLoop {

	public static void main(String[] args) {

		aa: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					continue aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}
