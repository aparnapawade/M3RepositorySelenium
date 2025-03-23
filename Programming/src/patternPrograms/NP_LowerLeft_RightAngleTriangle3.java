package patternPrograms;

import java.util.Scanner;

public class NP_LowerLeft_RightAngleTriangle3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		char ch = 97;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i>=j)  
				{
					System.out.print(ch + " "); 
				}
				else
				{
					System.out.print("  ");  
				}
			}
			ch++;
			System.out.println();
		}		
		sc.close();
	}
}
//a         
//b b       
//c c c     
//d d d d   
//e e e e e 