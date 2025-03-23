package numberPrograms;

import java.util.Scanner;

public class XPowerNUsingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value: ");
		int x = sc.nextInt();
		System.out.println("Enter the power value: ");
		int n = sc.nextInt();
		printXPowerN(x,n);
	// printXPowerN(2,5);
	// printXPowerN(-5, 3);
		sc.close();
	}
	
	public static void printXPowerN(int x, int n)
	{
		int result = 1;
		for(int i=1; i<=n; i++)
		{
			result = result * x;
		}
		System.out.println(x + " power " + n +" : " + result);
	}
}
