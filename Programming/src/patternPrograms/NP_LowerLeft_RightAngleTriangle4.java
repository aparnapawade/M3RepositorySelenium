package patternPrograms;

import java.util.Scanner;

public class NP_LowerLeft_RightAngleTriangle4 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
				
		for(int i=1; i<=n; i++)
		{	
			char ch = 97;     // char ch = 'a';
			for(int j=1; j<=n; j++,ch++)
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
			System.out.println();
		}
		sc.close();
	}
}
//a         
//a b       
//a b c     
//a b c d   
//a b c d e 