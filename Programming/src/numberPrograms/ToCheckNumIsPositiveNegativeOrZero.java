package numberPrograms;

import java.util.Scanner;

public class ToCheckNumIsPositiveNegativeOrZero {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scanner.nextInt();
		
		if(num == 0)
			System.out.println("It is a Zero");
		else if(num>0)
			System.out.println("It is a positive number");
		else
			System.out.println("It is a negative number");
		
		scanner.close();
	}

}
