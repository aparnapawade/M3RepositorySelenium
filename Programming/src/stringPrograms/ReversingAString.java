package stringPrograms;

public class ReversingAString {
	
	public static void main(String[] args) {
	
	String input = "Shri Swami Samarth";
	
	String res = ""; //Empty string- no space
	for(int i=input.length()-1; i>=0; i--)
	{
		char c = input.charAt(i);
		res = res + c;
	}
	System.out.println(res);
	}
}
//htramaS imawS irhS
