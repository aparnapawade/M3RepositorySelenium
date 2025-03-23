package numberPrograms;

import java.util.Scanner;

//TO FIND SMALLEST NUMBER AMONG 2 USING ONLY 1 IF
public class ToFindsmallestamong2numbersUsingOnly1if {

	public static void main(String[] args) {
		
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a = scanner.nextInt();
		System.out.println("Enter the second number: ");
		b = scanner.nextInt();
		
		int min = b;
		
		if(a<min) 
		{
			min = a;
		}
		System.out.println("Minimum number among given numbers is:" + min);
		
		scanner.close();
	}

}
