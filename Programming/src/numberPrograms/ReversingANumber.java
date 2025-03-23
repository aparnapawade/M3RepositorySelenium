package numberPrograms;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp;
		temp = num;
		int rev = 0;
		
		while(num != 0)
		{
			int ld = num%10;
			rev = rev*10 + ld;
			num = num/10;
		}
		System.out.println("The reverse of " + temp + " is: " + rev);
		
		sc.close();
	}
}
