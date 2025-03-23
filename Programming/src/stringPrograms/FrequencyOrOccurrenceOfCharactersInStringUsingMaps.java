package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOrOccurrenceOfCharactersInStringUsingMaps {

	public static void main(String[] args) {
		
		String input ="google";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<input.length(); i++)
		{
			char c = input.charAt(i);
			if(m.containsKey(c))
			{
				int value = m.get(c);
				m.put(c, ++value);
			}
			else
			{
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}
//{g=2, o=2, l=1, e=1}
