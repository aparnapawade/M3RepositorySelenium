package stringPrograms;

public class ExtractDigitsAndPerformSum {

	public static void main(String[] args) {
		
		String input = "Harsha12Gr5";  //This are the characters and digits(not numbers)
		int sum = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
            if (Character.isDigit(c))   //if(c >= '1' && c <= '9')
            {
              //sum = sum + Character.getNumericValue(c);
              //sum = sum + Integer.parseInt(c + ""); //by adding string making char as string for using string class method
            	sum = sum + (c - '0');  //ASCII value of '0' is 48
            }
		}
		System.out.println(sum);
	}
}
//8
