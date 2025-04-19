package javaconceptprogramming;

public class Operators {

	public static void main(String[] args) {
		// 1) Airthmetic operators + - * / %
		
		int a=20, b=10;
		
		int result=a+b;
		System.out.println("Sum of a and b is:" +result);
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff of a and b is:" +(a-b));
		System.out.println("Multiplication of a and b is:" +(a*b));
		System.out.println("Division of a and b is:" +(a/b));
		System.out.println("Modulo division of a and b is:" +(a%b));
		
		// 2) Relational/comparison operators > >= < <= != ==
		//returns boolean value- true/false
		
		System.out.println(a>b); //true
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		System.out.println(a<b); //false
		b=20;
		
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		boolean res=a>b;
		
		System.out.println(res);
		
		//3) logical operators && || !
		//returns only boolean value- true/false
		//it is works between two boolean value
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1=10>20;
		System.out.println(b1); //false
		boolean b2=20>10;
		System.out.println(b2); //true
		
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		
		System.out.println((10<20)&&(20>10));
		

	}

}
