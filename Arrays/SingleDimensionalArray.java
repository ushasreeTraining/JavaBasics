package Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int[] firstSet = { 1, 14, 25, 47 };

		int[] secondSet = new int[3];
		secondSet[0] = 15;
		secondSet[1] = 16;
		secondSet[2] = 17;

		for (int i = 0; i < firstSet.length; i++) {
			System.out.println(firstSet[i]);
		}
		System.out.println();
		
		for(int num: secondSet) {
			System.out.println(num);
		}

	}

}
