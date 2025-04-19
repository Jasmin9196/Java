package Array;

import java.util.HashMap;
import java.util.Map;

public class FindCountofeachelement_from_Array {

	public static void countFreq(int arr[]) {
		
		Map <Integer, Integer> map=new HashMap<Integer, Integer> ();
		
		for (int x : arr)
		{
			map.put(x, map.getOrDefault(x, 0)+1);
			
			/*if (map.containsKey(x)) {
				map.put(x, map.get(x) +1);
			}
			else 
			
			{
				map.put(x, 1);
			}*/
		}

	for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
		System.out.println(entry.getKey() +" -> "+ entry.getValue());
	}
}


public static void main(String[] args) {
	
	int arr[]= {10,20,30,20,50,10};
	 // Calling the function
	countFreq(arr);
}
}