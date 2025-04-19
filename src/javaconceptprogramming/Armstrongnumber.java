package javaconceptprogramming;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		/*Armstrong number is a number that is equal to the sum of cubes of its digits. 
		Input:  153 , Output: Yes 
		153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153 */
		
		int num=153;
		
		int sum=0,res,temp;
		temp=num;
		
		while (num>0)
		{
			res=num%10;
			num=num/10;
			sum=sum+(res*res*res);
			
		}
		
if (temp==sum) 
{
	System.out.println(temp +" is armstrong number"); 
}
	else
	{
		
	System.out.println(temp + " is Not armstrong number"); 
	}
}
}
	


