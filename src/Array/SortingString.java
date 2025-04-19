package Array;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		// char c[]= {'c','a','e','b'};
		
		String S[]= {"Jasmin","Akshay","Chetan"};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(S));
		
		Arrays.sort(S); //sort elements in array
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(S));
				

	}

}
