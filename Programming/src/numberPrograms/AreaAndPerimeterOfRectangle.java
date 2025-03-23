package numberPrograms;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double breadth = sc.nextDouble();
		
		System.out.println("Area of rectangle is: " + area(length, breadth));
		System.out.println("Perimeter of rectangle is: " + perimeter(length, breadth));
		
		sc.close();
	}
	
	public static double area(double length, double breadth)
	{
		double area = length * breadth;
		return area;
	}
	
	public static double perimeter(double length, double breadth)
	{
		double perimeter = 2*(length + breadth);
		return perimeter;
	}
	
}
