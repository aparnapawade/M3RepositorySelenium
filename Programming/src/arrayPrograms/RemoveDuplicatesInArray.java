package arrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {29, 18, 7, 1, 29, 7, 7};
		
	//Use LinkedHashSet if only needs to remove duplicates
	//Use TreeSet when needs to remove duplicates and sort them
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
	//LinkedHashSet	has add()-- used to add elements in it
	//add() -- will add only unique elements to set
	//add() -- will returns true-if element is unique and will add to set
	//add() -- will returns false-if element is duplicate and will not add to set
	
		for(int i=0; i<arr.length; i++)
		{
			lhs.add(arr[i]);
		}
		
		int[] res = new int[lhs.size()];
		int j = 0; //index variable for resultant array
		
	//Using	for-each loop to add elements from set to array
		for(int x: lhs)
		{
			res[j] = x;
			j++;
		}
	 System.out.println("Resultant array is: " + Arrays.toString(res));	
	}
}
//Resultant array is: [29, 18, 7, 1]