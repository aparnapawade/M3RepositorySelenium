package arrayPrograms;

import java.util.Arrays;

public class ToCreateDuplicateOfExistingArray {

	public static void main(String[] args) {
		
		int[] arr = {34, 67, 86, 4, 71, 78};
		
		int[] res = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			res[i] = arr[i];
		}
		
		System.out.println("Resultant array is: " + Arrays.toString(res));
	}
}
//Resultant array is: [34, 67, 86, 4, 71, 78]
