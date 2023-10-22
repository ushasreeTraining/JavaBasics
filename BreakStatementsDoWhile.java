package Basics;

public class BreakStatementsDoWhile {
	public static void main(String[] args) {

		int i = 0;

		do {
			System.out.println(i);
			if(i==2) {
				break;
			}
			i++;
		} while (i <= 5);
		

	}

}
