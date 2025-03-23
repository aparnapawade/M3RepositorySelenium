package numberPrograms;

import java.util.Scanner;

public class StrongNumberInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start and end range: ");
		int start = sc.nextInt();
		int end = sc.nextInt();                                   
		
		for(int i=start; i<=end; i++)
		{
		if(isStrong(i))
		{
			System.out.println(i);
		}
		}
		sc.close();
	}
	
	public static boolean isStrong(int num)
	{
		int temp = num;
		int sum = 0;
		while(num != 0)
		{
			int ld = num % 10;
			int fact = 1;
			for(int i=1; i<=ld; i++)
			{
				fact = fact * i;
			}
			sum = sum + fact;    //145 is strong number = 1! + 4! + 5!=1+24+120 =145
			num = num/10;         //1, 2, 145 is strong number
		}		
		return temp == sum;
	}
}
