package StringMethods;

public class Reverse_Each_Word_Sentence {

	public static void main(String[] args) {
		
		String s="reverse each word in a string";
		
		String rev="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		
			System.out.println("Reverse string is:"+rev);
		}

	}


