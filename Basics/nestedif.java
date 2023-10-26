package Basics;

public class nestedif {

	public static void main(String[] args) {
		int salary = 50000;
		if (salary > 20000) 
			{
				if (salary > 25000) {
					System.out.println("you got promotion and bonus");
			} 
				else {
				System.out.println("Promotion");
				}
			} 
		else {
			System.out.println("need to work hard");
		}
	}

}
