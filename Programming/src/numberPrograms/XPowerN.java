package numberPrograms;

import java.util.Scanner;

public class XPowerN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value: ");
		int x = sc.nextInt();
		System.out.println("Enter the power value: ");
		int n = sc.nextInt();
	//	int x = 2;
	//	int n = 5;
		int result = 1;
		for(int i=1; i<=n; i++)
		{
			result = result * x;
		}
		
		System.out.println(x + " power " + n +" : " + result);
		sc.close();
	}

}
