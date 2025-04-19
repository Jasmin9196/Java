package javaconceptprogramming;

public class EvenorOdd_Digitsinnumber {

	public static void main(String[] args) {
		// 
		
		int num=123457;
		
		int even_count=0;
		int odd_count=0;
		
		while (num>0) //1234 123 12 1
		
		{
			int rem=num%10; // 4 3 2 1
			
			if(rem%2==0)
			{
				even_count++; // 1 2
			}
			else
			{
				odd_count++; // 1 2 3
			}
			
			num=num/10; // 123 12 1 0
		}
			System.out.println("Count of even number:" + " " +even_count);
			System.out.println("Count of odd number:" + " " +odd_count);
		}

	}


