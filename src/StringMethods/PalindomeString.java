package StringMethods;

import java.util.Scanner;

public class PalindomeString {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner (System.in);
		System.out.println("Enter you string:");
		
		String str=sc.next();*/
		
		String org_str="radar";
		
		String rev="";
		
		int len=org_str.length();
		
		for (int i=len-1; i>=0; i--)
		{
			rev=rev+org_str.charAt(i);
		}
		
		if (org_str.equals(rev))
		{
			System.out.println(org_str+": is palindrome String");
		}
		else
		{
			System.out.println(org_str+": is not palindrome String");
		}
		
				

	}

}
