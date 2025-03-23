package arrayPrograms;

import java.util.Arrays;

public class PalindromeArrayUsingMethod {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 20, 10};
		
		if(isPalindrome(arr))
		{
			System.out.println(Arrays.toString(arr) + " is a palindrome array");
		}
		else
		{
			System.out.println(Arrays.toString(arr) + " is not a palindrome array");
		}
	}
	
	public static boolean isPalindrome(int[] arr)
	{	
		int[] rev = new int[arr.length];
		int k = 0; //index variable used for new array
		for(int i=arr.length-1; i>=0; i--)
		{
			rev[k] = arr[i];
			k++;
		}
		return Arrays.equals(arr, rev);
	}
}
//[10, 20, 30, 20, 10] is a palindrome array
