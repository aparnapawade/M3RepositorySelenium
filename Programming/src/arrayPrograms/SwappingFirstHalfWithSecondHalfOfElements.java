package arrayPrograms;

import java.util.Arrays;

public class SwappingFirstHalfWithSecondHalfOfElements {

	public static void main(String[] args) {
		//array should be of even length
		int[] arr = {10, 20, 30, 40, 50, 60};
		System.out.println("Before swapping adjacent elements: " + Arrays.toString(arr));

		int n = arr.length/2;
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[i+n];
			arr[i+n] = temp;
		}
		System.out.println("After swapping adjacent elements:" + Arrays.toString(arr));
	}
}
//Before swapping adjacent elements: [10, 20, 30, 40, 50, 60]
//After swapping adjacent elements:[40, 50, 60, 10, 20, 30]