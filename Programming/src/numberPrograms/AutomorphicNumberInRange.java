package numberPrograms;

import java.util.Scanner;

//An automorphic number is a number whose square ends in the same digits as the number itself.
//5 is an automorphic number because 5^2 = 25, which ends in 5.
//0, 1, 5, 6, 25, 76, 376.

public class AutomorphicNumberInRange {
	
	public static boolean isAutomorphic(int num)
	{	if(num<0)
		{ 
		num = -num;
		}
		int temp = num;
		int count = 0;
		int square = num*num;
		while(num != 0)
		{
			count++;
			num = num/10;
		}
		
		int res = square % (int)Math.pow(10, count);
		
		return res == temp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending range to print Automorphic numbers: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(isAutomorphic(i))
			{
				System.out.println(i);
			}
		}
		
		sc.close();	
	}
}
