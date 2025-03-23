package numberPrograms;

import java.util.Scanner;

public class HappyAndSadNumberInRange {
	
	public static boolean isHappy(int num)
	{
		if(num < 0)
		{
			num = -num;
		}
				
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
		
		return num == 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting and ending range to print Happy numbers: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		System.out.println("***** Followings are the Happy Numbers ***** ");
		for(int i=start; i<=end; i++)
		{
			if(isHappy(i))            //For Sad number if(! isHappy(i))
			{
				System.out.println(i);
			}
		}
		
		sc.close();
		
	}
}
