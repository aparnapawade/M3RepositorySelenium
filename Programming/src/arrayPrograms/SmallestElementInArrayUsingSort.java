package arrayPrograms;

import java.util.Arrays;

public class SmallestElementInArrayUsingSort {
	
	public static void main(String[] args) {
		
		int arr[] = {20, 10, 30, 4, 100};
        //Using sort method to sort array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr)); //Sorted array
        System.out.println("The first smallest element in array is: " + arr[0]);
        System.out.println("The second smallest element in array is: " + arr[1]);
	}
}
//Sorted array is: [4, 10, 20, 30, 100]
//The first smallest element in array is: 4
//The second smallest element in array is: 10