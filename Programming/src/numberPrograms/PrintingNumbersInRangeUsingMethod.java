package numberPrograms;

public class PrintingNumbersInRangeUsingMethod {
	
	public static void main(String[] args) {
	
	printNumbers(1, 100);
	printNumbers(10, 50);
	}
	
	public static void printNumbers(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			System.out.println(i);
		}
	}

}
