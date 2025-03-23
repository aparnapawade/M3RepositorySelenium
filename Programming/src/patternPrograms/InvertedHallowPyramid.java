package patternPrograms;

import java.util.Scanner;

public class InvertedHallowPyramid {
	
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=2*n-1; j++)
			{
				if(i==1 || i==j || i+j==2*n)  
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
		sc.close();
	}
}
//* * * * * 
//  *   *   
//    *          