package javaconceptprogramming;

public class Trycatch {

	public static void main(String[] args) {
		   int a = 5, b = 0;
	        
	        //System.out.println(a/b);

	        try {
	            System.out.println(a/b);
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	            System.out.println("The value");
	        }
	    }
	}
 
