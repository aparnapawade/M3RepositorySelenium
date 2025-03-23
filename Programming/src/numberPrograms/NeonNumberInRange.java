package numberPrograms;

import java.util.Scanner;

public class NeonNumberInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending range to print neon numbers: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(isNeon(i))
			{
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
	
	public static boolean isNeon(int num)
	{
		int sum = 0;
		int square = num*num;
		
		while(square != 0)
		{
			int ld = square%10;
			sum = sum + ld;
			square = square/10;
		}
		return sum == num;
	}
	
}
