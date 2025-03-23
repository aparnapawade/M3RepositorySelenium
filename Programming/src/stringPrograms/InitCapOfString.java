package stringPrograms;

public class InitCapOfString {

	public static void main(String[] args) {
		
		String input = "aSHwathaMa";
		
		//substring() method of String class returns a substring from the given string.
		//This method either take 1 parameter or 2 parameters i.e. start and end value as arguments.
		//In case, if the end parameter is not specified then the substring will end at the end of the string.
		//toLowerCase() method converts a string to lower case letters.
		//toUpperCase() method converts a string to upper case letters.
		
		String res = input.substring(0, 1).toUpperCase() +
					 input.substring(1).toLowerCase();
	
		System.out.println(res);
	}
}
//Ashwathama
