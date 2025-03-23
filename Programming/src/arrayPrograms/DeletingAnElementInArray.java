package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class DeletingAnElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {-2, 5, 5, -98, 198};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element that has to be deleted from array: " + Arrays.toString(arr));
		int element = sc.nextInt();
		
		//To count element's occurrence in array
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				count++;
			}
		}
		
		if(count == 0)
		{
			System.err.println("Element " + element + " is not present in array " + Arrays.toString(arr));
		}
		else
		{
		//Resultant array
		int[] res = new int[arr.length - count];
		//index for new created- resultant array
		int k = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(element != arr[i])
			{
				res[k] = arr[i];
				k++;
			}
		}
	  System.out.println("Resultant Array is: " + Arrays.toString(res));
		}
	  sc.close();
	}
}
//Enter an element that has to be deleted from array: [-2, 5, 5, -98, 198]
//5
//Resultant Array is: [-2, -98, 198]
