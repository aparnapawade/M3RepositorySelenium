package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayToCharacterArrayUsingMethod {
	
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
		System.out.println("Array: " + Arrays.toString(arr));
	//	int[] arr = {65, 56, 38, 49, 99, 86, 132};	
		char[] res = intArrayToCharArray(arr);
		System.out.println(Arrays.toString(res));
		
		sc.close();
	}	

	public static char[] intArrayToCharArray(int[] arr)
	{
		char[] res = new char[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			res[i] = (char)arr[i];
		}
		return res;	
	}                      
}
//[A, 8, &, 1, c, V, ]
