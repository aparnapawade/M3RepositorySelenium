package arrayPrograms;

import java.util.Arrays;

public class MergingTwoArrays_SecondArrayReverseThenMerged {

	public static void main(String[] args) {
			
			int[] arr1 = {-2, 6, 8};
			int[] arr2 = {18, 7, 21, 9};
			int[] arr3 = new int[arr1.length + arr2.length]; //For merged array
			
			int i = 0; //i - index for arr1
			int j = arr2.length - 1; //j - index for arr2
			for(int k=0; k<arr3.length ; k++) //k - index for arr3
			{
				if(k < arr1.length)
				{
					arr3[k] = arr1[i];
					i++;
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
// Merged array is: [-2, 6, 8, 9, 21, 7, 18]

