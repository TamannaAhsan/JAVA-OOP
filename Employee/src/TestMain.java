import java.util.*;

public class TestMain {
	
	public static void main (String [] args) {
		
		Employee e = new Employee(1,"Ahsan", "Mirpur", "018654");
		Manager m = new Manager(2, "Ahmed", "Mirpur","09876",8,500);
		Employee n = new Manager(3, "Ahmed Ali", "Mirpur","09765",8,500); 
		Employee s = new Supervisor(4, "Ria", "Mirpur","0876",8,800); 
		
		System.out.println("Employee Details \n"+e.toString());
		System.out.println("Employee Details \n"+m.toString());
		System.out.println("Employee Details \n"+n.toString());
		System.out.println("Employee Details \n"+s.toString());
		//System.out.println(m.salary(m.salary));
		
		
	}
}
