package Array;

public class Skip_the_Arrays {

	public static void main(String[] args) {

      int a[]= {10,30,40,50,70,80};
      
 
 for (int i=0; i<=a.length-1; i++)
 {
	 if (i==3 || i==4)
	 { 
		 continue;
	 }
	 System.out.println(a[i]);
 }
   
   
	}

}
