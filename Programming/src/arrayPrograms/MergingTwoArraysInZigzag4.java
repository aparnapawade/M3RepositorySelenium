package arrayPrograms;

import java.util.Arrays;

public class MergingTwoArraysInZigzag4 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {-2, 6, 8, 33};
		int[] arr2 = {18, 7, 21, 9};
		int[] arr3 = new int[arr1.length + arr2.length]; //For merged array
		
	//  For merging in zigzag always the arrays size we are merging should be same.
		int i = arr1.length - 1; //i - index for arr1
		int j = arr2.length - 1; //j - index for arr2
		for(int k=0; k<arr3.length ; k++) //k - index for arr3
		{
			if(k % 2 == 0)
			{
				arr3[k] = arr1[i];
				i--;
			}
			else
			{
				arr3[k] = arr2[j];
				j--;
			}
		}
		
		System.out.println("Merged array is: " + Arrays.toString(arr3));
	}
}
//Merged array is: [33, 9, 8, 21, 6, 7, -2, 18]
