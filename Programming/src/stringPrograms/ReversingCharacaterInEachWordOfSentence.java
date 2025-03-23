package stringPrograms;

public class ReversingCharacaterInEachWordOfSentence {

	public static void main(String[] args) {
		
		String input = "I need vanilla ice-cream";
		String result = "";
		
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			String resTemp = "";
			for(int j=temp.length()-1; j>=0; j--)  //for reversing the characters
			{
				resTemp = resTemp + temp.charAt(j);
			}
			result = result + resTemp + " ";
		}
	  result = result.trim();
	  System.out.println(result);
	}
}
//I deen allinav maerc-eci
