package arrayPrograms;

public class FrequencyOrOccurrenceOfElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 1, 1, 2, 4, 1};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != -1)  //compare and replace with any number which is not their in given array
			{
				int frequency = 1;
				
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						frequency++;
						arr[j] = -1;
					}
				}
			  System.out.println("The frequency of " + arr[i] + " in array is: " + frequency);	
			}
		}
	}
}
//The frequency of 1 in array is: 4
//The frequency of 2 in array is: 2
//The frequency of 3 in array is: 1
//The frequency of 4 in array is: 1