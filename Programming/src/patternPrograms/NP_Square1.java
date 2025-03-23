package patternPrograms;

import java.util.Scanner;

public class NP_Square1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int a = 1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i%2 == 1)
				{
					System.out.print(a++ + " ");
				}
				else
				{
					System.out.print(--a + " ");
				}			
			}
			a = a + n;
			System.out.println();
		}	
		sc.close();
	}
}            
//1 2 3 
//6 5 4 
//7 8 9 