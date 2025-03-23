package numberPrograms;

import java.util.Scanner;

public class Factorial_ProductOfNumberFrom1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
	//	int num = 5;	
		long factorial = 1;            //0! is 1 and 1! is 1
		for(int i=1; i<=num; i++)       //for(int i=n; i>=1; i--)--to print in descending order
		{
			factorial = factorial*i ;
		}
		System.out.println("Factorial of " + num + " is: " + factorial);
		sc.close();
	}
}
