package patternPrograms;

import java.util.Scanner;

public class NP_LowerLeft_RIghtAngleTriangle6 {
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
					System.out.print(i*j + " "); 
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
//2 4       
//3 6 9     
//4 8 12 16   
//5 10 15 20 25 