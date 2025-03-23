package stringPrograms;

public class RemoveFirstAndLastSpacesWithoutUsingTrimMethod {

	public static void main(String[] args) {
		
		String input = "    Idli, Vada, Sambar, Dosa       ";
	//	System.out.println(input.length());  //calculating complete length
		
	//	System.out.println(input.trim()); //--> Using trim method
		int start = 0;  //start index
		int end = input.length();  //taking end position
	//To find the index where we have first character apart from space	
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i) == ' ')
			{
				start++;
			}
			else
			{
				break;
			}
		}
	//	System.out.println(start);   //calculating starting space
		
	//To find the position where we have last character apart from space	
		for(int i=input.length()-1; i>=0; i--)
		{
			if(input.charAt(i) == ' ')
			{
				end--;
			}
			else
			{
				break;
			}
		}
	//	System.out.println(end); //calculating ending space
	
		input = input.substring(start, end);
		System.out.println(input);
	}
}
