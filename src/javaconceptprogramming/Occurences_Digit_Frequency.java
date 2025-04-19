package javaconceptprogramming;

import java.util.HashMap;
import java.util.Map;

public class Occurences_Digit_Frequency {

		
		 public static void countDigitFrequency(int num) {
		        Map<Integer, Integer> digitMap = new HashMap<>();

		        // Convert negative number to positive
		        //num = Math.abs(num);

		        while (num != 0) {
		            int digit = num % 10; // Extract last digit
		            digitMap.put(digit, digitMap.getOrDefault(digit, 0) + 1); //No need to if condition
		            num=num/10; // Remove last digit
		        }

		        // Print the frequency of each digit
		        for (Map.Entry<Integer, Integer> entry : digitMap.entrySet()) {
		            System.out.println("Digit " + entry.getKey() + " -> " + entry.getValue());
		        }
		    }

		    public static void main(String[] args) {
		        countDigitFrequency(1123581120);
		    }
		
	}


