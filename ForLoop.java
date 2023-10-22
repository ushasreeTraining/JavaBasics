package Basics;

public class ForLoop {

	public static void main(String[] args) {

		// print all even numbers from 1 to 20

		//Ascending
//		for (int i = 1; i <= 20; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
		//descending	
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
