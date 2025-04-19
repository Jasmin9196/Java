package javaconceptprogramming;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// Scanner Class // -----For String and Object only use sc.next() method-----
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Only Number:");
		int a=sc.nextInt();
		System.out.println("Given Number is:" +a);
		
		System.out.println("Enter city name:");
		String city=sc.next();
	    System.out.println("Given city is:" +city);	
	    

		System.out.println("Enter Unknow value:");
		Object value=sc.next();
	    System.out.println("Given unkonw value is:" +value);	
	}

}
