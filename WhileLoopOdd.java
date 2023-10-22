package Basics;

public class WhileLoopOdd {

	public static void main(String[] args) {
//asc
//		int i = 1;
//		while (i <= 10) {
//			if(i%2==1)
//			System.out.println(i);
//			i++;
//		}

		// desc
		int i = 10;
		while (i >= 1) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i--;
		}
	}

}
