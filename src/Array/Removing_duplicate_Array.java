package Array;

public class Removing_duplicate_Array {

	public static void main(String[] args) {
		
		    
		        String[] strArray = {"abc", "def", "abc", "mno", "xyz", "pqr", "xyz", "pqr"};

		        for (int i = 0; i < strArray.length - 1; i++) 
		        {
		            for (int j = i+1; j < strArray.length; j++) {
		                if (strArray[i].equals(strArray[j])) 
		                
		                {  

		                    System.out.println("Duplicate Element: " + strArray[i]);
		                }
		            }
		        }

	}

}
