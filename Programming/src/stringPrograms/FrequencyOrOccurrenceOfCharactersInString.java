package stringPrograms;

public class FrequencyOrOccurrenceOfCharactersInString {

	public static void main(String[] args) {
		
		String input = "google";
		
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) != '#') //compare and replace with any special character which is not present in string
			{
				int  frequency = 1;
				
				for(int j=i+1; j<input.length(); j++)
				{
					if(input.charAt(i) == input.charAt(j))
					{
						frequency++;
					}
				}
			 System.out.println("The frequency of " + input.charAt(i) + " in string is: " + frequency);
			 input = input.replace(input.charAt(i), '#');  //need to replace here-diffrence between array and string
			}
		}
	}
}
//The frequency of g in string is: 2
//The frequency of o in string is: 2
//The frequency of l in string is: 1
//The frequency of e in string is: 1