package stringPrograms;

public class ReversingOrderOfWordsInSentence {

	public static void main(String[] args) {

		String input = "I Love Shri Swami Samarth Maharaj";
		String output = "";
		//Using split method to split the string based on space(" ")
		String[] arr = input.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			output = output + arr[i] + " "; 
		}
		//added space as entire string will be printed as one word-as we split string based on space
		//Because above added space to print the space between words-will add space at start and end of string
		//Using trim method- removes whitespace from both ends of a string
		output = output.trim();
		System.out.println(output);
	}
}
//Maharaj Samarth Swami Shri Love I
