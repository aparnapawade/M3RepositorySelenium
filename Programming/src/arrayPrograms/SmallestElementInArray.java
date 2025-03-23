package arrayPrograms;

import java.util.Arrays;

//To find Smallest Or Minimum element in Array
public class SmallestElementInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {-2, 10, 18, -7, 16, 12};
		int min = arr[0]; //assume as arr[0] is smallest
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println(min + " is a smallest element in array " + Arrays.toString(arr));
	}
}
//-7 is a smallest element in array [-2, 10, 18, -7, 16, 12]

