package patternPrograms;

import java.util.Scanner;

public class NP_LowerLeft_RIghtAngleTriangle2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)  
				{
					System.out.print(a + " "); 
					a++;
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
//2 3       
//4 5 6     
//7 8 9 10   
//11 12 13 14 15