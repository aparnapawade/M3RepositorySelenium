package arrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOrOccurrenceOfElementsInArrayUsingMaps {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 1, 1, 2, 4, 1};
		
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(m.containsKey(arr[i]))
			{
                m.put(arr[i], m.get(arr[i]) + 1);
			}
			else
			{
				m.put(arr[i], 1);
			}
		}
		System.out.println(m);
	}
}
//{1=4, 2=2, 3=1, 4=1}
