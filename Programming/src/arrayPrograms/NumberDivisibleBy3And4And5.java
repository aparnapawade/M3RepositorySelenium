package arrayPrograms;

public class NumberDivisibleBy3And4And5 {

	public static void main(String[] args) {
		
		int[] arr = {23, 45, 60, 6, 180};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%3==0 && arr[i]%4==0 && arr[i]%5==0)
			{
				System.out.println(arr[i] + " is divisible by 3,4 and 5");
			}
		}
	}
}
//60 is divisible by 3,4 and 5
//180 is divisible by 3,4 and 5