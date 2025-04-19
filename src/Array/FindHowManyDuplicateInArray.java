package Array;

public class FindHowManyDuplicateInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,10,40};
		int num=10;
		int count=0;
		
		for (int i=0; i<=4; i++)
		{
			if (a[i]==num)
			{
			count++;
			}
		}
			{
				System.out.println("Duplicate number count is:" +count);
			}
		}

	}


