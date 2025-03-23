package arrayPrograms;

import java.util.Arrays;

//To find Second Smallest/ Second Minimum Element in Array
public class SecondSmallestElementInArray {
		
	public static void main(String[] args) {
			
			int[] arr = {-2, 10, 18, -7, 16, 12};
			
			//For Finding First Smallest or First Minimum
			int min = arr[0]; //assume as arr[0] is smallest
			
			for(int i=1; i<arr.length; i++)
			{
				if(arr[i] < min)
				{
					min = arr[i];
				}
			}
			
			//For Finding Second Smallest or Second Minimum
			int secondMin = Integer.MAX_VALUE;
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] < secondMin && arr[i] != min)
				{
					secondMin = arr[i];
				}
			}
			
			System.out.println(secondMin + " is a second smallest element in array " + Arrays.toString(arr));
		}
}
//-2 is a second smallest element in array [-2, 10, 18, -7, 16, 12]
