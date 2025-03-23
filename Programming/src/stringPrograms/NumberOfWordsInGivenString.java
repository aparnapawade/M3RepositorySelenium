package stringPrograms;

public class NumberOfWordsInGivenString {

	public static void main(String[] args) {
		
		String input = "I love India";
		
		String[] arr = input.split(" ");
		System.out.println("The number of words present in "+ input + " are: " + arr.length);	
	}
}
//The number of words present in I love India are: 3
