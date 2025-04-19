package StringMethods;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the words");
		String s=sc.nextLine(); //Welcome to java
		int count=1;
		
		for (int i=0;i<s.length(); i++)
		
		{
			if ( (s.charAt(i)==' ')&& (s.charAt(i+1)!= ' '))
			{
				count++;
			}
		}
		
		System.out.println("Number of the words in a string:" +count);
		
		

	}

}
