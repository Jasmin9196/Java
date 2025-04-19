package javaconceptprogramming;

public class Largestof3Number {

	public static void main(String[] args) {
		
		int a=10, b=20, c=5;
		
		if (a>b && a>c)
		{
			System.out.println("a is a largest number");
		
		}
		
		else if (b>a && b>c)
		{
			System.out.println("b is a largest number");
			
		}
		
		else 
		{
			System.out.println("c is a largest number");
		}
	}

}
