package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintOddNumbersInEvenIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Integer array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " values for Interger array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
	//	int[] arr = {10, 4, 35, 24, -11, -8, 20};
		System.out.println("Array: " + Arrays.toString(arr));
		//Arrays.toString());  //To print the array in String format
		
		System.out.println("The Odd elements present in Even index are: ");
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0 && arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
		sc.close();
	}
}
//Array: [10, 4, 35, 24, -11, -8, 20]
//The Odd elements present in Even index are: 35
