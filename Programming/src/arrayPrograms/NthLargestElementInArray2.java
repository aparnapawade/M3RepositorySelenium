package arrayPrograms;

import java.util.Scanner;

//To find nth largest use this program- from n=1....
public class NthLargestElementInArray2 {

	public static void main(String[] args) {
    int[] arr = {-2, 10, 18, -7, 16, 12};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth value: ");
		int n = sc.nextInt();
		int max = Integer.MAX_VALUE; //assuming it as maximum
	
		for(int j=1; j<=n; j++)
		{
			int currentMax = Integer.MIN_VALUE;

			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] > currentMax && arr[i] < max)
				{
					currentMax = arr[i];
				}
			}
			max = currentMax;
		}
		
		System.out.println("The " + n + " largest element in array is: " + max);
		sc.close();
	}
}
//Enter the nth value: 
//2
//The 2 largest element in array is: 16