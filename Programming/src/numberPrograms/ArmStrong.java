package numberPrograms;

import java.util.Scanner;

//armstrong no. = x power n --->   number = x     count the digits in number = n
//153 is armstrong --> no. of digits: 3 --> 1^3 + 5^3 + 3^3 = 1+125+27 = 153
//1634 is armstrong --> no. of digits: 4 --> 1^4 + 6^4 + 3^4 + 4^4 = 1+1296+81+256 = 1634

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp1, temp2;
		temp1 = temp2 = num;
		int count = 0;
		int sum  = 0;
		
		while(temp2 != 0)            
		{							
			count++;
			temp2 = temp2/10; //updation
		}
		
		while(num != 0)
		{
			int ld = num%10;
			sum = sum + (int)Math.pow(ld, count);
			num = num/10;
		}
		
		if(sum == temp1)
		{
			System.out.println(temp1 + " is a armstrong number");
		}
		else
		{
			System.out.println(temp1 + " is not a armstrong number");
		}	
		sc.close();
	}
}
