package numberPrograms;

import java.util.Scanner;
//145 is strong number = 1! + 4! + 5!=1+24+120 =145
public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num != 0)
		{
			int ld = num % 10;
			sum = sum + factorial(ld);          
			num = num/10;
		}
		
		if(sum == temp)
			System.out.println(temp + " is a strong number");
		else
			System.out.println(temp + " is not a strong number");	
		sc.close();
	}
	
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
}
