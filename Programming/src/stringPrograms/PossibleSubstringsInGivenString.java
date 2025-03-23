package stringPrograms;

public class PossibleSubstringsInGivenString {

	public static void main(String[] args) {
		
		String input = "abcd";
		
		for(int i=0; i<input.length(); i++) //taking condition for index
		{
			for(int j=i+1; j<=input.length(); j++) //taking condition for position <=
			{
				System.out.println(input.substring(i, j));
			}
		}
	}
}
// a ab abc abcd b bc bcd c cd d