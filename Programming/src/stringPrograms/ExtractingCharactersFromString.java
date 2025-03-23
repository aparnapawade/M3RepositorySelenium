package stringPrograms;

public class ExtractingCharactersFromString {

	public static void main(String[] args) {
		
		String s = "Shri Swami Samarth";
		
		//To calculate length of String- use length() method of String class
		//To access characters one by one- use charAt(int index) method of String class	
		System.out.println(s.length()); 
		
		for(int i=0; i<s.length(); i++)
		{
			char res = s.charAt(i);
			System.out.println(res);
		}
	}
}
