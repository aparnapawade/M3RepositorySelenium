package stringPrograms;

public class ExtractAndCountVowelsConsonantsDigitsSpecialcharacters {

	public static void main(String[] args) {
		
		String input = "HelloWorld!123";
		
		 int countVowels = 0;
	     int countConsonants = 0;
	     int countDigits = 0;
	     int countSpecial = 0;
	        	
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			{
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				{
					countVowels++;
					System.out.println(c + " is a vowel");
				}
				else
				{
					countConsonants++;
					System.out.println(c + " is a consonant");
				}
			}
			else if(c >= '0' && c <= '9')
			{
				countDigits++;
				System.out.println(c + " is a digit");
			}
			else
			{
				countSpecial++;
				System.out.println(c + " is a special character");
			}				
		}
		System.out.println("Vowels: " + countVowels); 
        System.out.println("Consonant: " + countConsonants); 
        System.out.println("Digit: " + countDigits); 
        System.out.println("Special Character: " + countSpecial);
	}
}
