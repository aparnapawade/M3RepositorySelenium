package numberPrograms;

import java.util.Scanner;

public class FactorialUsingRecursiveMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is " + factorial(num)); 
		sc.close();
	}
	
		public static long factorial(int num)
		{
			if(num == 1 || num == 0)
			{
				return 1;
			}
			return num*factorial(num-1);
		}
	}
