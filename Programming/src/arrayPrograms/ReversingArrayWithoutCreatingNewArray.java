package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

//ReversingArrayWithoutCreatingNewArray---UsingSwapping
public class ReversingArrayWithoutCreatingNewArray {

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
	//	int[] arr = {18, 45, 7, 8, 10};
		int k = arr.length - 1; //k - calculating index from end
		for(int i=0; i<arr.length/2; i++) //i - calculating index from start
		{
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			k--;
		}
		System.out.println("Reverse of given array is: " + Arrays.toString(arr));
		sc.close();
	}
}
//Reverse of given array is: [10, 8, 7, 45, 18]
