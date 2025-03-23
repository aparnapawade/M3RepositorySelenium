package stringPrograms;

public class PrintWordsIfStartsWithVowels {

	public static void main(String[] args) {
		
		String input = "I am Aparna and I like eating";
		
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			char c = temp.toLowerCase().charAt(0);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				System.out.println(temp);
			}
		}
	}
}
//I am Aparna and I eating 