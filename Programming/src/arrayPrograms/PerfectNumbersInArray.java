package arrayPrograms;

public class PerfectNumbersInArray {

	public static void main(String[] args) {
		
		int[] arr = {16, 6, 21, 13, 28, 7};
		
		int perfectCount = 0;
		for(int i=0; i<arr.length; i++)
		{
			int num = arr[i];
			int sum = 0;
			for(int j=1; j<=(num+1)/2; j++)
			{
				if(num%j == 0)
				{
					sum = sum + j;
				}
			}
			if(num == sum)
			{
				perfectCount++;
				System.out.println(num);
			}
		}
		System.out.println("There are " + perfectCount + " perfect numbers present in an array");
	}
}
