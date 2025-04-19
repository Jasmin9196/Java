package Array;

public class TwoDimesionArray {

	public static void main(String[] args) {
		// Approach 1
		
		/*int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600; */
		
		//Approach 2
		
		int a[][]= {{100,200},{300,400},{500,600}};
		
		//Find Size of array
		System.out.println("lenght of row" +" " +a.length);
		System.out.println("lenght of column" +" " +a[0].length);
		
		//Read single value from array
		
		System.out.println(a[1][0]); //300
		
		//read multiple value from an array
		
		/*for (int r=0; r<=a.length-1; r++) // 0 1 2
		{
			for (int c=0;c<=a[r].length-1; c++) // 0 1
			{
				System.out.println(a[r][c]);
			}
		}*/
		
		//Enhanced for loop
		
		for (int arr[]:a)
		{
			for (int y:arr)
			{
				System.out.print(y+ " ");
			}
			System.out.println();
		}

	}
	}



