package stringPrograms;

public class PrintDuplicateWordsInString {

	public static void main(String[] args) {
		
		String input = "bengaluru e sala cup namdhe , namdhe e sala";
		
		String[] arr = input.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != "#")
			{
				int frequency = 1;
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i].equals(arr[j]))  //comparing strings so used equals() method
					{                          //for array and characters use -- equality operator ==
						frequency++;
						arr[j] = "#";
					}
				}
		//To print duplicate words frequency > 1 and to print unique words frequency == 1 	
				if(frequency > 1)  
				{
					System.out.println(arr[i]);
				}
			}
		}		
	}
}
//e sala namdhe


