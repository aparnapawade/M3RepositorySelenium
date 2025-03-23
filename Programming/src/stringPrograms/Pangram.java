package stringPrograms;

//A pangram is a sentence that uses every letter of the alphabet at least once. 
public class Pangram {

	public static void main(String[] args) {
		
		String input = "The quick brown fox jumps over the lazy dog";
		input = input.toLowerCase();
		
		boolean result = true;
		
		//To check if all letters are present in string or not
		for(char ch='a'; ch<='z'; ch++)  
		{
			int count = 0;
			
			for(int i=0; i<input.length(); i++)
			{
				if(ch == input.charAt(i))
				{
					count++;
				}					
			}
			
			if(count == 0) //means char not present in given string - not pangram
			{
				result = false;
				break;
			}
		}
		
		if(result)
		{
			System.out.println("Is Pangram");
		}
		else
		{
			System.out.println("Is Not Pangram");
		}
	}
}
//Is Pangram
