package StringMethods;

public class StringComparison {

	public static void main(String[] args) {
		// == and equals()---Comparison
		
		//Case -1
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);  //true
		System.out.println(s1.equals(s2)); //true
		
		// == Compare new object
		// equals() Compare the value of object 
		
		String s3=new String("welcome");
		String s4=new String ("welcome");
		System.out.println(s3==s4);  //false
		System.out.println(s3.equals(s4)); //true
		

	}

}
