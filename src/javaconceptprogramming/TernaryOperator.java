package javaconceptprogramming;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//var=exp? result1 : result 2;
		
		//Example 1
		
		int a=200, b=100;
		
		int x=(a>b)? a: b;
		System.out.println(x);
		
		//Example 2
		
		int y=(1==1)? 100: 200;
		System.out.println(y);
		
		int z=(1==2)? 100: 200;
		System.out.println(z);
		
		//Example 3
		
		int person_age=30;
		String age=(person_age>=18)? "eligible": "not eligible";
		System.out.println(age);
		
		//Unary operators : ++ -- += -= *= /= %= = ! ----Only one variable require
		//Binary operators : Arithmetic + Relational + logical (!) ----- Two variable require
		//ternary operators : ?:

	}

}
