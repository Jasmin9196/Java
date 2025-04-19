package javaconceptprogramming;
//Natural number >1
//Which has only 2 factors 1 and itself

//19>>Prime Number

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=39;
		int count=0;
		
		if(num>1)
		{
			for (int i=1; i<=num; i++)
			{
				if (num%i==0)
				{
					count++;
			}
			}
			if (count==2)
			{
				System.out.println("The number is prime number:" +num);
			}
			else
			{
				System.out.println("Not a prime number");
			}
			
		}
		else
		{
			System.out.println("Not a prime Number");
		}

	}

}
