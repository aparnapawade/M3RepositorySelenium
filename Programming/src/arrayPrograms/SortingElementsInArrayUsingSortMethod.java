package arrayPrograms;

import java.util.Arrays;

public class SortingElementsInArrayUsingSortMethod {
	
	public static void main(String[] args) {
		
		int[] arr = {18, 12, 7, -5, 17};
		System.out.println("Before sorting: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
}
//Before sorting: [18, 12, 7, -5, 17]
//After sorting: [-5, 7, 12, 17, 18]