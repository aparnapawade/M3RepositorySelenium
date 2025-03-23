package stringPrograms;

public class ToCountLowercaseAlphabetsInEachWord {

	public static void main(String[] args) {
		
		String input = "I am Very GrateFul";
		
		String[] arr = input.split(" ");
		
		for(int i=0; i<arr.length; i++)
		{	
			int count = 0;
			String temp = arr[i];
			
			for(int j=0; j<temp.length(); j++)
			{
				char c = temp.charAt(j);
				if(c>='a' && c<='z')
				{
					count++;
				}
			}
		System.out.println(temp + " has " + count + " lowercase alphabets");
		}
	}
}
//I has 0 lowercase alphabets
//am has 2 lowercase alphabets
//Very has 3 lowercase alphabets
//GrateFul has 6 lowercase alphabets