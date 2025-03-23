package patternPrograms;

import java.util.Scanner;

public class ToUnderstandNestedLoops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: "); // i - for rows      
		int n = sc.nextInt();   //j - for columns
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j + " ");       
			}
			System.out.println();
		}
		
		sc.close();
	}
}
//1 2 3 
//1 2 3 
//1 2 3 