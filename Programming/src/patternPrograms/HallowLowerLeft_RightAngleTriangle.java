package patternPrograms;

import java.util.Scanner;

public class HallowLowerLeft_RightAngleTriangle {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || j==1 || i==n)  
				{
					System.out.print("* ");  //1 char+ 1 space
				}
				else
				{
					System.out.print("  ");  //2 space
				}
			}
			System.out.println();
		}	
		sc.close();
	}
}

//*       
//* *     
//*   *   
//* * * * 