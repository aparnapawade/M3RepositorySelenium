package numberPrograms;

public class PrintNumbersWithoutLoopOrUsingRecursiveMethod{

	public static void main(String[] args) {
		
		printNumbers(100, 4);
		printNumbers(-5, 20);
	}
	
	public static void printNumbers(int start, int end)
	{
		if(start > end)
		{
			return;
		}
		System.out.println(start);
		
		if(start == end)
		{
			return;
		}
		
		printNumbers(start+1, end); //method recursion
	}

}
