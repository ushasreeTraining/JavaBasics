package Basics;

public class IfElseIfLadder {
	
	public static void main(String[] args) {
		
		int marks = 90;
		
		if(marks<35) {
			System.out.println("Fail");
		}
		else if (marks>35 && marks<50) {
			System.out.println("Avg student");
		}
		else if (marks>50 && marks<75) {
			System.out.println("Above Avg student");
		}
		else {
			System.out.println("Topper");
		}
	}

}
