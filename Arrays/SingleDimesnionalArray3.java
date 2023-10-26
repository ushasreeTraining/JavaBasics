package Arrays;

public class SingleDimesnionalArray3 {

	public static void main(String[] args) {

		int[] Array = new int[4];
		Array[0] = 15;
		Array[1] = 15;
		Array[2] = 15;
		Array[3] = 15;

		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum = sum + Array[i];
			
		}
		System.out.println(sum);
	}

}
