package numberPrograms;

import java.util.Scanner;

//WAP TO CALCULATE AREA AND CIRCUMFERENCE OF CIRCLE

public class AreaAndCircumferenceOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value: ");
		double radius = sc.nextDouble();
	//	double radius= 4.5;
		area(radius);
		circumference(radius);
		sc.close();
	}
	
	public static void area(double radius)
	{
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is: " + area);
	}
	
	public static void circumference(double radius)
	{
		double circumference = 2* 3.14*radius;
		System.out.println("Circumference of circle is: " + circumference);
	}

}
