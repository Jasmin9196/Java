package StringMethods;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str= " I want  to learn automation testing";
		
		System.out.println("Befor removing the white space:" +str);
		
		str=str.replaceAll("\\s", "");
		System.out.println("after removing the white space:" +str);

	}

}
