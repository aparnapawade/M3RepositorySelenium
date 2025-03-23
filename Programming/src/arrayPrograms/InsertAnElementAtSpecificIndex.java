package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElementAtSpecificIndex {

	public static void main(String[] args) {
		
		int[] arr = {-2, 5, 9, -98, 198};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element that has to be inserted to array: " + Arrays.toString(arr));
		int element = sc.nextInt();
		System.out.println("Enter an Index where you want to insert " + element);
		int index = sc.nextInt();
	
		if(index >= 0 && index <= arr.length)
		{
	// Creating new array with length of old array+1 --to add one more element
		int[] res = new int[arr.length + 1];
		res[index] = element;   //adding the element at specified index
		
		int i = 0; // i - Variable representing index of old array
		for(int k=0; k<res.length; k++)   // k - Variable representing index of new-resultant array
		{
			if(k != index)
			{
				res[k] = arr[i];
				i++;
			}
		}
		
		System.out.println("Resultant Array is: " + Arrays.toString(res));
		}	
		else
		{
			System.err.println("This Index is not present, Please enter the valid Index.");
		}	
		sc.close();
	}
}
//Enter an element that has to be inserted to array: [-2, 5, 9, -98, 198]
//8
//Enter an Index where you want to insert 8
//4
//Resultant Array is: [-2, 5, 9, -98, 8, 198]