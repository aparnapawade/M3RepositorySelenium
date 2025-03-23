package stringPrograms;

public class ToExtractCharactersAtOddIndex {

	public static void main(String[] args) {
		
		String input = "softwareengineer";
		
		System.out.print("The characters present at odd index are: ");
		for(int i=0; i<input.length(); i++)
		{
			if(i%2==1)
			{
				char c = input.charAt(i);
				System.out.print(c + " ");
			}
		}		
	}
}
//The characters present at odd index are: o t a e n i e r 