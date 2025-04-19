package javaconceptprogramming;

public class DecrementOperator {

	public static void main(String[] args) {
		// 	-- is called increment operator
		
		//case 1
		
		/*int a=10;
		a--; //a=a-1
		System.out.println(a); //9
		*/
		
		//case 2 //post increment
		
		int a=100;
		int res=a--;
		System.out.println(res); //100
		System.out.println(a); //99
				
		//case 3 //pre increment
		
		int b=100;
		int res1=--b;
		System.out.println(res1); //99
		System.out.println(b); //99
		

	}

}
