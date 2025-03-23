package numberPrograms;

import java.util.Scanner;

public class DisariumNumberInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string and ending range to print ArmStrong number: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++)
		{
			if(isDisarium(i))
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	public static boolean isDisarium(int num)
	{
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
			count--;
			num = num/10;
		}
		return temp1 == sum;
	}
}
