package numberPrograms;

import java.util.Scanner;

public class ExtractingDigitsInGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();   //initialization
		System.out.println("==== Extracting and Printing the numbers ====");
		
		if(num == 0)
		{
			System.out.println("0");
		}
		else
		{
		while(num != 0)
		{
			int ld = num%10;
			System.out.println(ld);
			num = num/10; //updation
		}
		}
		sc.close();
	}

}
