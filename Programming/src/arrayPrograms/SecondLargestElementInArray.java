package arrayPrograms;

import java.util.Arrays;

//To find Second Largest/ Second Max Element in Array
public class SecondLargestElementInArray {
	
public static void main(String[] args) {
		
		int[] arr = {-2, 10, 18, -7, 16, 12};
		
		//For Finding First Largest or First Maximum
		int max = arr[0]; //assume as arr[0] is largest
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		//For Finding Second Largest or Second Maximum
		int secondMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > secondMax && arr[i] != max)
			{
				secondMax = arr[i];
			}
		}
		
		System.out.println(secondMax + " is a second largest element in array " + Arrays.toString(arr));
	}
}
//16 is a second largest element in array [-2, 10, 18, -7, 16, 12]
