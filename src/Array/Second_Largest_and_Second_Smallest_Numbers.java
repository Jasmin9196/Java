package Array;

import java.util.Arrays;

public class Second_Largest_and_Second_Smallest_Numbers {

	public static void main(String[] args) {
		
		// Code to find second largest and second smallest numbers in an array 
		int[] arrayList = { 4, 2, 7, 1,3, 6,12,15,20 }; 
		int num=arrayList.length; 
		Arrays.sort(arrayList); 
		
		System.out.println("After Sorting" + Arrays.toString(arrayList));
	
		System.out.println("Second Largest element is "+arrayList[num-2]); //Second largest
		 
		System.out.println("Second Smallest element is "+arrayList[1]); //Second smallest
	}

}
