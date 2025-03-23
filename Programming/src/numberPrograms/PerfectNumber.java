package numberPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Perfect no. are: 6, 28, 496, 8128
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=(num+1)/2; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
		System.out.println(num==sum ? num + " is a perfect number" : num + " is not a perfect number");
		sc.close();
	}
}
