package numberPrograms;

import java.util.Scanner;

public class ToCalculateSimpleInterest {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount: ");
		double principle = sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the time period: ");
		double time = sc.nextDouble();
		//	double si = calculateSimpleInterest(2000, 10.8, 2);
		double si = calculateSimpleInterest(principle, rate, time);
		System.out.println(si);		
		sc.close();
	}
	
	public static double calculateSimpleInterest(double principle, double rate, double time)
	{
		double simpleInterest = (principle*rate*time)/100;
		return simpleInterest;
	}
	
}
