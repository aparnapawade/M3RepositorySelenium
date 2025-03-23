package numberPrograms;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num; //as at last if used num in printing statement will get 0 as num's value 
		int count = 0;
		do
		{
			count++;
			num = num/10; //updation
		}while(num != 0);
		
		System.out.println("Count of digits in " + temp + " is " + count);
		
		sc.close();
	}

}
