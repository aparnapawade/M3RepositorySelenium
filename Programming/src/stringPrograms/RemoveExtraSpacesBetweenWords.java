package stringPrograms;

//To Remove extra spaces or consecutiove spaces between words in String
public class RemoveExtraSpacesBetweenWords {

	public static void main(String[] args) {
		
		String input = "    I    want Brownie    Ice-cream         ";
		
		input = input.trim();  //to remove start-end spaces
		//Using replaceAll(String regex, String replacement) --Regex method
		input = input.replaceAll("\\s+", " ");   // \\s - to remove single space & \\s+ - to remove more than one space
		System.out.println(input);
	}
}
//I want Brownie Ice-cream
