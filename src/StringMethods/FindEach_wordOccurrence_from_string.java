package StringMethods;

import java.util.HashMap;
import java.util.Map;

public class FindEach_wordOccurrence_from_string {

	
	
		public static void main(String[] args) { 
			String str = "Alice is girl and Bob is boy";  // Output = {Bob=1, Alice=1, and=1, is=2, girl=1, boy=1}
			Map<String, Integer> hashMap = new HashMap<>(); 
			String words [] = str.split(" "); 
			for (String word : words) { 
				
				hashMap.put(word, hashMap.getOrDefault(word, 0)+1);
				
			}
			/*if (hashMap.containsKey(word)) 
			hashMap.put(word, hashMap.get(word) + 1); 
			else 
			hashMap.put(word, 1); 
			} */
			System.out.println(hashMap); 

	}

}
