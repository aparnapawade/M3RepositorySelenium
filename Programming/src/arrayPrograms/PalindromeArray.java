package arrayPrograms;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 20, 10};
		
		int[] rev = new int[arr.length];
		int k = 0; //index variable used for new array
		for(int i=arr.length-1; i>=0; i--)
		{
			rev[k] = arr[i];
			k++;
		}
		
		if(Arrays.equals(arr, rev))
		{
			System.out.println(Arrays.toString(arr) + " is a palindrome array");
		}
		else
		{
			System.out.println(Arrays.toString(arr) + " is not a palindrome array");
		}
	}
}
//[10, 20, 30, 20, 10] is a palindrome array
