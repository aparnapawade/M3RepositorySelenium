package arrayPrograms;

//To extract digits not numbers
public class ExtractAndCountDigitsInArray {

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 0, 899, 3};
		
		for(int i=0; i<arr.length; i++)
		{
			int num = arr[i];
			for(int j=0; j<=num; j++)
			{
				if(num == 0)
				{
					System.out.print("0 ");
				}
				else
				{
				while(num != 0)
				{
					int ld = num%10;
					System.out.print(ld + " ");
					num = num/10; //updation
				}
				}
			}
		}
	}
}
//2 1 5 0 9 9 8 3 