package arrayPrograms;

import java.util.Scanner;

public class NthLargestElementInArray1 {
	
	public static void main(String[] args) {
		
		int[] arr = {-2, 10, 18, -7, 16, 12};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth value: ");
		int n = sc.nextInt();
		
		//For Finding First Largest or First Maximum
		int max = arr[0]; //assume as arr[0] is largest
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		//For Finding nth Largest or nth Maximum	
		int secondMax = Integer.MIN_VALUE;
		for(int j=2; j<=n; j++)
		{
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] > secondMax && arr[i] < max)
				{
					secondMax = arr[i];
				}
			}
			max = secondMax;
			secondMax = Integer.MIN_VALUE;  //re-initializing
		}
		
		System.out.println("The " + n + " largest element in array is: " + max);
		sc.close();
	}
}
//Enter the nth value: 
//4
//The 4 largest element in array is: 10
