package stringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "Madam";
		
		String res = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			char c = s.charAt(i);
			res = res + c;
		}
		
	  System.out.println(s.equalsIgnoreCase(res)? "Is palindrome" : "Is not palindrome");
	}
}
//Is palindrome
