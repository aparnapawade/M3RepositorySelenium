package numberPrograms;

import java.util.Scanner;

// A neon number is a number where the sum of the digits of its square is equal to the original number. 
// 9 is a neon number because 9^2 = 81, and 8 + 1 = 9

public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int square = num*num;
		
		while(square != 0)
		{
			int ld = square%10;
			sum = sum + ld;
			square = square/10;
		}
		
		if(sum == num)
		{
			System.out.println(num + " is a neon number");
		}
		else
		{
			System.out.println(num + " is not a neon number");
		}
		
		sc.close();
	}

}
