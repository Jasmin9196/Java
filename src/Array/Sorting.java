package Array;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// Use sorting method for set of value
		
		int a[]= {10,30,20,40,50};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a)); //[10, 30, 20, 40, 50]
		
		Arrays.sort(a); //sort elements in array
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
		
	}

}
