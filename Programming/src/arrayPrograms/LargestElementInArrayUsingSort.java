package arrayPrograms;

import java.util.Arrays;

public class LargestElementInArrayUsingSort {

	public static void main(String[] args) {
		
        int arr[] = {20, 10, 30, 4, 100};
        //Using sort method to sort array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array is: " + Arrays.toString(arr)); //Sorted array
        System.out.println("The first largest element in array is: " + arr[arr.length - 1]);
        System.out.println("The second largest element in array is: " + arr[arr.length - 2]);
	}
}
//Sorted array is: [4, 10, 20, 30, 100]
//The first largest element in array is: 100
//The second largest element in array is: 30