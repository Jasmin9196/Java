package javaconceptprogramming;

public class ForLoop {

	public static void main(String[] args) {
		// for (initilization; condition; inc/dec)
		
		// 1 to 10 number
		
		/*for (int i=1; i<=10; i++)
		{
			System.out.println(i);
		}*/

		// Print even number between 1 to 10
		
		
		/*for (int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}*/

		//Identify even and odd number between 1 to 10
		
		for (int i=1; i<=10; i++)
		{
			if (i%2==0)
			{
			 System.out.println(i+ " "+ "even");
			}
			else
			{
				System.out.println(i+ " "+ "odd");
			}
		}
		
		//Print 1 to 10 in decending order
		
		for (int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		
	}

}
