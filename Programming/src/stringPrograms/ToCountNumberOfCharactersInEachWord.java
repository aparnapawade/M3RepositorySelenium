package stringPrograms;

public class ToCountNumberOfCharactersInEachWord {

	public static void main(String[] args) {
		
		String input = "I Love Shri Swami Samarth";
		
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			System.out.println("The no. of characters present in " + temp + " are: " + temp.length());
		}
	}
}
//The no. of characters present in I are: 1
//The no. of characters present in Love are: 4
//The no. of characters present in Shri are: 4
//The no. of characters present in Swami are: 5
//The no. of characters present in Samarth are: 7