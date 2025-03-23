package stringPrograms;

import java.util.Arrays;

//An anagram is a word that uses all the letters once and only once.
public class Anagram {

	public static void main(String[] args) {

		String input1 = "Listen";
		String input2 = "Silent";
		
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
//		boolean result = Arrays.equals(arr1, arr2);
//		if(result)
//		{
//			System.out.println("Is Anagaram");
//		}
//		else
//		{
//			System.out.println("Is not Anagram");
//		}
		
		System.out.println(Arrays.equals(arr1, arr2) ? "Is Anagram" : "Is Not Anagram");
	}
}
//Listen --> listen (lowercase) --> {'l','i','s','t','e','n'} (converting to array) --> (sorting) --> then compare
//Silent --> silent (lowercase) --> {'s','i','l','e','n','t'} (converting to array) --> (sorting) --> then compare