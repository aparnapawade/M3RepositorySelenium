package numberPrograms;

import java.util.Scanner;

public class SumOfSquareOfDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num; //as at last if used num in printing statement will get 0 as num's value 
		int sum = 0;
		while(num != 0)
		{
			int ld = num%10;
			sum = sum + ld * ld;
			num = num/10;
		}
		
		System.out.println("Sum of square of the digits in " + temp + " is " + sum);
		sc.close();
	}

}

