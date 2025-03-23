package numberPrograms;

import java.util.Scanner;

public class YoungestOfTwoSiblings {

	public static void main(String[] args) {
		int rohanAge, mohanAge;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rohan Age: ");
		rohanAge = sc.nextInt();
		System.out.println("Enter the Mohan Age: ");
		mohanAge = sc.nextInt();
		if(rohanAge>=0 && mohanAge>=0)
		{
			if(rohanAge<mohanAge)
				System.out.println("Rohan is youngest");
			else
				System.out.println("Mohan is youngest");
		}
		else
		{
			System.err.println("Invalid Ages!");
		}
		
		sc.close();
	}

}
