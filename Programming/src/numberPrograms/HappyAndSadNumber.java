package numberPrograms;

import java.util.Scanner;
// A happy number is a number that eventually reaches 1 when you square each of its digits and add them together. 
// 13 is happy no. --> 1^2 + 3^2 = 1+9 = 10 --> 1^2 + 0^2 = 1+0 = 1
// A number that is not happy is called sad or unhappy. 
public class HappyAndSadNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num < 0)
		{
			num = -num;
		}
		
		int temp = num;
		
		while(num!=1 && num!=4)
		{	
			int sum = 0;
			while(num != 0)
			{
				int ld = num%10;
				sum = sum + ld*ld;
				num = num/10;
			}
			num = sum;
		}
		System.out.println(num == 1 ? temp + " is a Happy Number" : temp + " is a Sad/Unhappy number");
		sc.close();
	}

}
