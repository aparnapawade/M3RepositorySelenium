package numberPrograms;

import java.util.Scanner;
// A Perfect Number “n”, is a positive integer which is equal to the sum of its divisors/factors, excluding “n” itself.
// 28 --> Divisors/factors of 28 = 1, 2, 4, 7, 14, 28 --> Perfect no. = 1+2+4+7+14 = 28
//6 --> Divisors/factors of 6 = 1, 2, 3, 6 --> Perfect no. = 1+2+3 = 6
public class PerfectNumberInRangeUsingMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending range to print reverse: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start; i<=end; i++)
		{
			if(isPerfect(i))
			{
				System.out.println(i + " is a perfect number");
			}
		}
		sc.close();
	}

	public static boolean isPerfect(int num)
	{  	
		int sum = 0;
		for(int i=1; i<=(num+1)/2; i++)
		{
		if(num%i == 0)
		{
			sum = sum+i;
		}		
	    }
		return sum == num;
	}
}
