package numberPrograms;

import java.util.Scanner;

public class PrimeNumberUsingMethod {
	
	public static boolean isPrime(int num)
	{
		int count = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		return count == 2;
	}

	public static void main(String[] args) {
//		int num1 = 6;
//		if(isPrime(num1))
//		{
//			System.out.println(num1 + " is a prime number.");
//		}
//		else
//		{
//			System.out.println(num1 + " is not a prime number.");
//		}		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== Print Prime NUmbers In Range ====");
		System.out.println(" Enter the starting and ending range: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}	
		sc.close();
	}
}
