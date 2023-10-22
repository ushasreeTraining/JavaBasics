package Basics;

public class TernaryOperators {
	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		int min;
		
		

//		if (a < b) {
//			min = a;
//		} else {
//			min = b;
//		}
		
		min = (a < b)?a:b;
		System.out.println(min);
		
		var result = (a+b>5)? "positive":"negative";
		System.out.println("Number is " + result);

	}

}
