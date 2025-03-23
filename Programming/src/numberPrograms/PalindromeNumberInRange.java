package numberPrograms;

import java.util.Scanner;

public class PalindromeNumberInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending range to print palindrome: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	public static boolean isPalindrome(int num)
	{
		int temp = num;
		int rev = 0;
		while(num != 0)
		{
			int ld = num%10;
			rev = rev * 10 +ld;
			num = num/10;
		}
		return temp == rev;
	}
}
