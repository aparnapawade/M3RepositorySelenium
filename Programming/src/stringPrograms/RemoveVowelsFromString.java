package stringPrograms;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		
		String input = "Anamika$2";
		String result = "";
		
		for(int i=0; i<input.length(); i++)
		{
			char ch = input.charAt(i);
			
			if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
				result = result + ch;
			}
		}
	 System.out.println("The resultant word is: " + result);	
	}
}
//The resultant word is: nmk$2
