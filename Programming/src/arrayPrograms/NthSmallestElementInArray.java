package arrayPrograms;

import java.util.Scanner;

public class NthSmallestElementInArray {

	public static void main(String[] args) {
	    int[] arr = {-2, 10, 18, -7, 16, 12};
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the nth value: ");
			int n = sc.nextInt();
			int min = Integer.MIN_VALUE;  //assuming it as minimum
		
			for(int j=1; j<=n; j++)
			{
				int currentMin = Integer.MAX_VALUE;

				for(int i=0; i<arr.length; i++)
				{
					if(arr[i] < currentMin && arr[i] > min)
					{
						currentMin = arr[i];
					}
				}
				min = currentMin;
			}
			
			System.out.println("The " + n + " smallest element in array is: " + min);
			sc.close();
	}
}
//Enter the nth value: 
//2
//The 2 smallest element in array is: -2