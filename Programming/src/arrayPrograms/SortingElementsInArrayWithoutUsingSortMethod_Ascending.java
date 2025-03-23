package arrayPrograms;

import java.util.Arrays;

public class SortingElementsInArrayWithoutUsingSortMethod_Ascending {

	public static void main(String[] args) {
		
		int[] arr = {18, 12, 7, 1, 17};
		System.out.println("Before sorting: " + Arrays.toString(arr));

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])   //for descending just change <
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
}
//Before sorting: [18, 12, 7, 1, 17]
//After sorting: [1, 7, 12, 17, 18]