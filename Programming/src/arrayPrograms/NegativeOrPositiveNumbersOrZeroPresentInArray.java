package arrayPrograms;

public class NegativeOrPositiveNumbersOrZeroPresentInArray {

	public static void main(String[] args) {
		
		int[] arr = {10, 45, -5, 0, -89};
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < 0)
			{
				System.out.println(arr[i] + " is a negative number");
				countNegative++;
			}
			else if(arr[i] > 0)
			{
				System.out.println(arr[i] + " is a positive number");
				countPositive++;
			}
			else
			{
				System.out.println(arr[i] + " is a zero");
				countZero++;
			}
		}
		System.out.println("There are " + countNegative + " negative numbers present in array");
		System.out.println("There are " + countPositive + " positive numbers present in array");
		System.out.println("There are " + countZero + " zero present in array");
	}
}
//10 is a positive number
//45 is a positive number
//-5 is a negative number
//0 is a zero
//-89 is a negative number
//There are 2 negative numbers present in array
//There are 2 positive numbers present in array
//There are 1 zero present in array
