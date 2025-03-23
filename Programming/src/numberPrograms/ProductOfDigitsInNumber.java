package numberPrograms;

import java.util.Scanner;

public class ProductOfDigitsInNumber {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num; //as at last if used num in printing statement will get 0 as num's value 
		int product = 1;
		while(num != 0)
		{
			int ld = num%10;
			product = product * ld;
			num = num/10;
		}
		
		System.out.println("Product of the digits in " + temp + " is " + product);
		sc.close();
	}

}
	
