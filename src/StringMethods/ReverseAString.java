package StringMethods;

public class ReverseAString {

	public static void main(String[] args) {
		// Approach -1 length() ,chartAt()
		
		/*String s="Selenium with java";
		String rev="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		
			System.out.println("Reverse string is:"+rev);
		}*/

          //Approach 2 -By converting string to char array type
	
	/*String s="welcome";
	
	String rev="";
	
	char c[]=s.toCharArray();
	

	for (int i=c.length-1; i>=0; i--)
	{
		rev=rev+c[i];
	}
	
	
		System.out.println("Reverse string is:"+rev);
	}*/

	
	    //Approach 3 -Using StringBufferClass
		
		StringBuffer s=new StringBuffer("Welcome");
		
		System.out.println("Reverse String is:" +s.reverse());
		
		//Approach 4 -Using StringBuilderClass
		
				StringBuilder d=new StringBuilder("Welcome");
				
				System.out.println("Reverse String is:" +d.reverse());
				
	 //String- immutable
				
				String b="Welcome";
				String c="Java automation";
				
				System.out.println(b.concat(c));
			
				
				//StringBuffer - Mutable
				
                StringBuilder h=new StringBuilder("Welcome");
				
				System.out.println(h.append("to java automation"));
				
	}
	
	
	
}