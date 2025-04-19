package javaconceptprogramming;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping value are:" +a +" " +b);

		//Logic 1 - Third variable (t)
		
		/*int t=a; // t=10
		
		a=b; // a=20
		b=t; // b=10 */
		
		//2nd approach
		
		a=a+b;  //a=10=20=30
		b=a-b; //b=30-20=10
		a=a-b; // a=30-10=20
		
		System.out.println("after swapping value are:" +a +" " +b); 
		
		
	}

}
