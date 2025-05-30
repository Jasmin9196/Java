package Array;

import java.util.ArrayList;
import java.util.List;

public class FindingCommonElementsinArray {

    public static void main(String[] args) {
       
        // By using the for loop

        Integer[] array1 = { 4, 2, 3, 1, 6 }; 
        Integer[] array2 = { 6, 7, 8, 4 }; 
        List<Integer> commonElements = new ArrayList<>(); 
        
        for (int i = 0; i < array1.length; i++) { 
            for (int j = 0; j < array2.length; j++) { 
                if (array1[i].equals(array2[j])) { 
                    commonElements.add(array1[i]); 
                }
            }
        }
        
        System.out.println("Common Elements for given two array List is: " + commonElements); 
    }
}
