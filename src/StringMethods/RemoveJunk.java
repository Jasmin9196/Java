package StringMethods;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="@#89testing76%$$!Java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
