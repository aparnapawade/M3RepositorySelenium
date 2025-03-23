package numberPrograms;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square: ");
		double side = sc.nextDouble();
		
		System.out.println("Area of square is: " + area(side));
		System.out.println("Perimeter of square is: " + perimeter(side));
		
		sc.close();
	}
	
	public static double area(double side)
	{
		double area = side*side;
		return area;
	}
	
	public static double perimeter(double side)
	{
		double perimeter = 4*side;
		return perimeter;
	}
	
}
