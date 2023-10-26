package Methods;

public class Scanner {

	public static void main(String[] args) {
		isEven(4);
		isEven(8);
		isEven(15);
		isEven(7);
	 
	 
	}
	
	private static void isEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is odd");
		}
	}

}
