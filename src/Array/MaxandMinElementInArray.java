package Array;

public class MaxandMinElementInArray {

	public static void main(String[] args) {
		int a[]= {50,100,40,120,60};
		
		int max=a[0];
		
		for (int i=0; i<=a.length-1; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
System.out.println("Maximum Element is array is:" + max);

	}

}
