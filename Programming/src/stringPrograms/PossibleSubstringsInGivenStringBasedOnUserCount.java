package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PossibleSubstringsInGivenStringBasedOnUserCount {

	public static void main(String[] args) {
		
		String input = "javaprogramming";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters to be present in substring: ");
		int n = sc.nextInt();
		
		ArrayList<String> a1 = new ArrayList<String>();   //ArrayList follows sorting and insertion order and we can access using index
		for(int i=0; i<=input.length()-n; i++)
		{
			a1.add(input.substring(i, i+n));      //to add substrings to arraylist
		}
		System.out.println("== Before sorting ==" + a1);
		Collections.sort(a1);
		System.out.println("== After sorting ==" + a1);
		System.out.println("First element after sorting: " + a1.get(0)); //smallest element as per ASCII value
		System.out.println("Last element after sorting: " + a1.get(a1.size()-1)); //largest element as per ASCII value
		sc.close();
	}
}	
//Enter the number of characters to be present in substring: 
//3
//== Before sorting ==[jav, ava, vap, apr, pro, rog, ogr, gra, ram, amm, mmi, min, ing]
//== After sorting ==[amm, apr, ava, gra, ing, jav, min, mmi, ogr, pro, ram, rog, vap]
//First element after sorting: amm
//Last element after sorting: vap
