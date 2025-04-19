package Array;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// Declare an array//add values into array//Find length of array//read single value from an array
		//read multiple value from an array
		
		{
			
		//Declaring array
			
			//Approach 1
			
			int a[]=new int[5];
			a[0]=100;
			a[1]=200;
			a[2]=300;
			a[3]=400;
			a[4]=500;
			
			//Approach 2
			
			int b[]= {100,200,300,400,500};
			//find a length of array
			System.out.println("Length of an array:" +b.length);
			
			//read single value from an array
			System.out.println(b[4]);
			
			//reading all values from an array
			
			//Normal for loop
			
			//for (int i=0; i<=4; i++) 
			
			/*for (int i=0; i<=a.length-1; i++)
			{
				System.out.println(a[i]);
			}*/
			
			//enhanced for loop/ for ...each loop
			
			for (int x:a)
			{
				System.out.println(x);
			}
		}
		
		

	}

}
