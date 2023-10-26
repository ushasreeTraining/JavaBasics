package assignments;

public class EvenOddProgram_While {

	public static void main(String[] args) {

		int i = 1;
		// Even
		while (i <= 10) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}

		// odd
		while (i <= 10) {
			if (i % 2 == 1)
				System.out.println(i);
			i++;
		}

	}

}
