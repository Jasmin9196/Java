package StringMethods;

public class Reverse_the_entire_sentence {

	public static void main(String[] args) {
		//Input = "India is country My" 
		//Output = "My country is India"
		
		
		String orignal="India is country My";
				
				String str[] = orignal.split(" "); 
				System.out.println(str.length);
				String rev = ""; 
				for (int i = str.length - 1; i >= 0; i--)
				{ 
				rev = rev + str[i] + " "; 
				} 
				//System.out.println(ans.substring(0, ans.length() - 1));
				
				System.out.println(rev);

}
}