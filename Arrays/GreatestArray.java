package Arrays;

public class GreatestArray {

	public static void main(String[] args) {
		 int arr[] = {10, 5, 23, 8, 15, 30, 12};
	     int max = arr[0];
	     for(int i=0; i<arr.length; i++)
	     {
	       if(max < arr[i])
	       {
	          max = arr[i];
	       }
	     }
	    System.out.print(max); 
	  }
	
}
