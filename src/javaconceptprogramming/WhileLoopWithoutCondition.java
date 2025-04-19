package javaconceptprogramming;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
	
		int i=1;
		
		while(true)
		{
			System.out.println("hello");
			i++;
			
			if(i==10)
			{
				break;
			}
		}

	}

}


