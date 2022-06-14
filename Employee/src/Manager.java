
public class Manager extends Employee {
	
	public int hr;
	public int salary;
	
	public Manager(int id, String name, String address, String phone, int hr,int salary) {
		super(id,name,address,phone);
		this.hr = hr;
		this.salary = salary;
			
	}
	
	@Override
	public int salary(int salary) {
		return (hr*salary);
		
	}
	
	@Override
	protected int salaryBonus(int salary) {
		return (hr*salary + 2000);
		
	}
	
	@Override
	public String toString() {
		return("Id:"+id+"\n"+"Name:"+name+"\n"+"Address:"+address+"\n"+"Phone:"+phone+"\n"+"Salary:"+salary(salary)+"\n"+"Salary Bonus:"+salaryBonus(salary)+"\n");
	}
	

}
