package numberPrograms;

import java.util.Scanner;

public class AreaAndPerimeterOfTriangle {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height: ");
		int height = sc.nextInt();
		
		System.out.println("Enter the side1/base: ");
		int side1 = sc.nextInt();
		int base = side1;
		
		System.out.println("Enter the side2: ");
		int side2 = sc.nextInt();
		
		System.out.println("Enter the side3: ");
		int side3 = sc.nextInt();
				
		System.out.println(area(base, height));
		System.out.println(perimeter(side1, side2, side3));
		//	System.out.println(area(3.5, 4));

		sc.close();
	}
	
	public static double area(double base, double height)
	{
		return 0.5*base*height;
	}
	
	public static double perimeter(double side1, double side2, double side3)
	{
		return side1+side2+side3;
	}
}
