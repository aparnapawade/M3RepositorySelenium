package arrayPrograms;

public class SumAndAverageOfElements {
	
public static void main(String[] args) {
		
	int[] arr = {0, 8, -19, 86, 78, 45, 7};
	int sum = 0;
	double avg;
	
	for(int i=0; i<arr.length; i++)
	{
		sum = sum + arr[i];
	}
	System.out.println("Sum of Elements in array is: "+ sum);
	avg = (double)sum/arr.length;
	System.out.println("Average of Elements in array is: "+ avg);
	}
}
//Sum of Elements in array is: 205
//Average of Elements in array is: 29.285714285714285