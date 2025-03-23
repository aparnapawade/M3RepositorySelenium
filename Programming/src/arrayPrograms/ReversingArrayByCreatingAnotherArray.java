package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArrayByCreatingAnotherArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Integer array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter " + size + " values for Interger array: ");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
	//	int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[arr1.length];  //Creating new array of the same size as first array
		int k = 0;     //index variable used for new array
		for(int i=arr1.length-1; i>=0; i--)
		{
			arr2[k] = arr1[i];
			k++;
		}
		System.out.println("Reverse of " + Arrays.toString(arr1) + " is: "+ Arrays.toString(arr2));
		sc.close();
	}
}
//Reverse of [10, 20, 30, 40, 50] is: [50, 40, 30, 20, 10]
