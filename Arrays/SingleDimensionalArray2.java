package Arrays;

import java.util.Arrays;

public class SingleDimensionalArray2 {

	public static void main(String[] args) {

		int[] secondSet = new int[5];
		secondSet[0] = 1;
		secondSet[1] = 2;
		secondSet[2] = 3;
		secondSet[3] = 4;
		secondSet[4] = 5;
		
		int[] testArray = Arrays.copyOf(secondSet, secondSet.length);
		testArray[2] = 22;
	
		for(int mynum: secondSet) {
			System.out.println(mynum);
		}
		System.out.println();
		for(int mynum: testArray) {
			System.out.println(mynum);
		}
		
	}

}
