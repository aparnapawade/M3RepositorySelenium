package numberPrograms;

import java.util.Scanner;

public class EvenOrOddBySubtracting2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		
		while(temp > 1)
		{
			temp = temp-2;
		}
		System.out.println(temp == 0 ?num + " is an even number" : num + " is an odd number");
		
		sc.close();
	}

}
