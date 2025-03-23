package patternPrograms;

import java.util.Scanner;

public class SolidHourglassVertical {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=2*n-1; i++)
		{
			for(int j=1; j<=2*n-1; j++)
			{
				if(!((i>j && i+j<2*n) || (i<j && i+j>2*n))) //If not using !-Not operator 
				{                                           //Need to print "  " in if condition
					System.out.print("* ");                 //And * need to print in else condition
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
//   * * * * *     
//     * * *       
//       *         
//     * * *       
//   * * * * *     
