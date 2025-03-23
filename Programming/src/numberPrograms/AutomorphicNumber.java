package numberPrograms;

import java.util.Scanner;

// An automorphic number is a number whose square ends in the same digits as the number itself.
// 5 is an automorphic number because 5^2 = 25, which ends in 5.
// 0, 1, 5, 6, 25, 76, 376.

public class AutomorphicNumber {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;
		int square = num*num;
		
		if(num<0)
		{
			num = -num;
		}
		
		int temp = num;	
		
		while(num != 0)
		{
			count++;
			num = num/10;
		}
		
		int res = square % (int)Math.pow(10, count);
		
		if(res == temp)
		{
			System.out.println(temp + " is a Automorphic number");
		}
		else
		{
			System.out.println(temp + " is not a Automorphic number");
		}
		
		sc.close();
	}
}
