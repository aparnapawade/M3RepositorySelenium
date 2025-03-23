package stringPrograms;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		
		String input = "ShriSwamiSamarth";
		String res = "";
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			if(!(res.contains(c + "")))
			{
				res = res + c;
			}
		}
	  System.out.println(res);
	}
}
//Shriwamt