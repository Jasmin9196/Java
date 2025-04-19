package StringMethods;

public class Employee {

		// Variables
		
		int eid;
		static String ename="ravi";
		String job;
		int sal;
		
		//Methods
		
		void display()
		
		{
			System.out.println(eid);
			System.out.println(ename);
			System.out.println(job);
			System.out.println(sal);
			
		}
		public static void main(String[] args) {
			
			Employee emp1= new Employee(); //object
			
			emp1.eid=101;
			emp1.job="Manager";
			emp1.sal=50000;
			emp1.display();
			
			Employee emp2= new Employee();
			emp2.eid=102;
			emp2.job="Engineer";
			emp2.sal=70000;
			emp2.display();
		
			
	} 

}
