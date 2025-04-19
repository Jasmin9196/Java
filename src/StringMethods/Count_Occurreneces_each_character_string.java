package StringMethods;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurreneces_each_character_string {

	   public static void getCharCount(String name) {
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		char strArray[]=name.toCharArray();
		
		for (char c : strArray) {
			
			if(!String.valueOf(c).isBlank()) {
				charMap.put(c, charMap.getOrDefault(c, 0)+1);
			/*if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}*/
		}
		}
		System.out.println(name+" : "+ charMap);
	}


public static void main(String[] args) {
	
	getCharCount("Welcome to java program");
	
	
}
}
