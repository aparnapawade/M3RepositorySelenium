package stringPrograms;

public class ToPrintWordsWhichContainsEvenNumberOfCharacters {

	public static void main(String[] args) {
		
		String input = "Yesterday India has won the championship trophy";
		
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			if(temp.length()%2 == 0)
			{
				System.out.println(temp);
			}
		}
	}
}
//championship
//trophy
