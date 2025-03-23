package numberPrograms;

import java.util.Scanner;
//Disarium number ==> 175 = 1 power 1 + 7 power 2 + 5 power 3 -->count of digits needs to reduce 
public class DisariumNumber {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int temp1, temp2;
		temp1 = temp2 = num;
		int count = 0;
		int sum  = 0;
	// To calculate the count of digits in number	
		while(temp2 != 0)      
		{
			count++;
			temp2 = temp2/10; //updation
		}
		
		while(num != 0)
		{
			int ld = num%10;    
			sum = sum + (int)Math.pow(ld, count);
			count--;             //this is only difference in Armstrong and Disarium no. program
			num = num/10;
		}
		
		if(sum == temp1)
		{
			System.out.println(temp1 + " is a disarium number");
		}
		else
		{
			System.out.println(temp1 + " is not a disarium number");
		}
		
		sc.close();
	}

}
