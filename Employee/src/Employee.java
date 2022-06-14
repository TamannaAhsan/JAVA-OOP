import java.util.*;

public class Employee {
	
	public int id;
	public String name;
	public String address;
	public String phone;
	
	public Employee(int id, String name, String address, String phone ) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
	public int salary(int salary) {
		return 0;
	}
	
	protected int salaryBonus(int salary) {
		return 0;
	}
	
	public String toString() {
		return("Id:"+id+"\n"+"Name:"+name+"\n"+"Address:"+address+"\n"+"Phone:"+phone+"\n");
	}

}
