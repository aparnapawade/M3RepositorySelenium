package arrayPrograms;

import java.util.Arrays;

public class IntArrayToCharacterArray {

	public static void main(String[] args) {
		
		int[] arr1 = {65, 56, 38, 49, 99, 86, 132};
		char[] arr2 = new char[arr1.length];
		
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i] = (char)arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
}
//[A, 8, &, 1, c, V, ]
