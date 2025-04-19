package StringMethods;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// length()-Returns length of string (number of characters)
		
		String s="welcome";
		s.length();
		System.out.println(s.length()); //7
		System.out.println("welcome".length()); //7
		
		//concat()-Joining strings
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1.concat(s2+s3));
		System.out.println(s1+s2+s3);	//without method
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("welcome".concat("to java").concat("automation"));
		
		//trim()-remove space right and left side
		
		s=" welcome ";
		System.out.println("Before trimming:" +s.length());
		System.out.println(s.trim());
		System.out.println("After trimmed:" +s.trim().length());

		//chartAt()- returns a character from a string based on index //index start from 0
		
		s="welcome";
		System.out.println(s.charAt(3));
		
		//contains()=returns true/false
		//check the string is part of main string or not?
		
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("Wel")); //false
		System.out.println(s.contains("weld")); //false
		
		//substring()-extract substring from the main string
		//Starting index -0
		//Ending index -1
		
		s="selenium";
		System.out.println(s.substring(1,3)); //el
		
		//toUpparCase() and toLowerCase()
		
		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() -Split the string into multiple based on delimeter
		
		s="abc@gmail.com";
		String a[]=s.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//ex 1
		String amount="$15,20,55";
		System.out.println(amount.replace("$","")); // 15,20,55
		System.out.println(amount.replace("$","").replace(",", "")); //152055
		
		//ex 2
		
		s="abc,123@xyz";
		String arr1[]=s.split(","); //abc 123@xyz
		System.out.println(Arrays.toString(arr1)); // [abc, 123@xyz]
		
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[123, xyz]
		System.out.println(arr1[0]); //abc
		System.out.println(arr2[0]); //123
		System.out.println(arr2[1]); //xyz
		
		//ex 3
		
		s="abc 123";
		String b[]=s.split(" ");
	    System.out.println(Arrays.toString(b));
	    
	    // * % ^ & () -you can not use as delimeters
	    
	  
	    
	    //ex 4
	    
         String name="John kenedy";
	    
	    //System.out.println(name.contains("john")); // false
	    System.out.println(name.replace('J', 'j').contains("john")); //true
	    System.out.println(name.toLowerCase().contains("john")); //true
	    		
		
		//equals() , equalsIgnoreCase() -Compare string
		
		s1="Welcome";
		s2="Welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("welcome")); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		//replace() -replace single/multiple (sequence) of character in a string
		
		s="welcome to selenium java to selenium python";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "c shap"));
		
		
	}

}


