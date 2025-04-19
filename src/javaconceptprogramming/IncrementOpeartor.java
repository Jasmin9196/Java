package javaconceptprogramming;

public class IncrementOpeartor {

	public static void main(String[] args) {
		
		// ++ is called increment operator
		
		//case 1
		
		/*int a=10;
		a++; //a=a+1
		System.out.println(a);
		*/
		
		//case 2 //post increment
		
		int a=10;
		int res=a++;
		System.out.println(res);
		System.out.println(a);
				
		//case 3 //pre increment
		
		int b=10;
		int res1=++b;
		System.out.println(res1);
		System.out.println(b);
		

	}

}
