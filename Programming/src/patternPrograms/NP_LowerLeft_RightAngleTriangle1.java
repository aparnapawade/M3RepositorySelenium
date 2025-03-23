package patternPrograms;

import java.util.Scanner;

public class NP_LowerLeft_RightAngleTriangle1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)  
				{
					System.out.print(j + " "); //for printing rows no. use i
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
//1         
//1 2       
//1 2 3     
//1 2 3 4   
