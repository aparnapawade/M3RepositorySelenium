package numberPrograms;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num != 0)
		{
			int ld = num%10;
			rev = rev*10 + ld;
			num = num/10;
		}
		
		System.out.println(temp == rev ? "It is a palindrome" : "It is not a palindrome");
		sc.close();
	}
}
