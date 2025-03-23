package arrayPrograms;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = {16, 6, 21, 24, 13, 11, 7, 47};
		
		int primeCount = 0;
		for(int i=0; i<arr.length; i++)
		{
			int num = arr[i];
			int count = 0;
			for(int j=1; j<=num; j++)
			{
				if(num%j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				primeCount++;
				System.out.println(num);
			}
		}
		System.out.println("There are " + primeCount + " prime numbers present in an array");
	}
}
//13 11 7 47
//There are 4 prime numbers present in an array