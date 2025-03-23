package numberPrograms;

import java.util.Scanner;

public class EvenOrOddByUsingModulusOperator {

	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? num + " is even" : num + " is odd");    
       sc.close();
	}
}
