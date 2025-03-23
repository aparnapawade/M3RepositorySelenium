package arrayPrograms;

import java.util.Arrays;

//To find Largest Or Maximum element in Array
public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {-2, 10, 18, -7, 16, 12};
		int max = arr[0]; //assume as arr[0] is largest
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println(max + " is a largest element in array " + Arrays.toString(arr));
	}
}
//18 is a largest element in array [-2, 10, 18, -7, 16, 12]

