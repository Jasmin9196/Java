
package javaconceptprogramming;

import java.util.Scanner;

public class PlindromeNumber {

	public static void main(String[] args) {
		// Same number get after reverse
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		int num=sc.nextInt();
		
		int org_number=num;
				
	    int rev=0;
		
		while (num>0)
			
		{
			rev=rev*10 + num%10; //0+1234%10=4 40+3=43 430+2=432 4320+1=4321
			num=num /10; //1234/10=123 123/10=12 12/10=1 1/10=0
		}
      
		if (org_number==rev)
		{
          System.out.println(org_number +" " + "Palindrome Number");
	}
		else
		{
			System.out.println(org_number +" " + "Not Palindrome Number");
		}
}
}
