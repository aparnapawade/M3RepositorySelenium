package arrayPrograms;

import java.util.Arrays;

public class SwappingAdjacentElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60};
		System.out.println("Before swapping adjacent elements: " + Arrays.toString(arr));
		
		int n;
		if(arr.length%2 == 0) 	//for odd length and even length array	
		{
			n=1;
		}
		else
		{
			n=2;
		}
		
		for(int i=0; i<arr.length - n; i=i+2)
		{
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println("After swapping adjacent elements:" + Arrays.toString(arr));
	}
}
//Before swapping adjacent elements: [10, 20, 30, 40, 50, 60]
//After swapping adjacent elements:[20, 10, 40, 30, 60, 50]