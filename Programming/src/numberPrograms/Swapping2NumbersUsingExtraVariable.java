package numberPrograms;

import java.util.Scanner;

public class Swapping2NumbersUsingExtraVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int temp = a;
		int b = sc.nextInt();
	//	int a = 10, b = 20;
		System.out.println("Before swapping: ");
		System.out.println(a);
		System.out.println(b);
		
		//Logic to swap without using extra variable
		a = b;
		b = temp;
		System.out.println("After swapping: ");
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}

}
