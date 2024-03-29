package assignment10;

class Employee{
	String name;
	double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public  String getEmployeeDetails() {
		return "Name:"+name+",Salary"+salary;

	}
}

class HourlyEmployee  extends Employee{
	private double hourlyRate;
	private int hoursWorked;
	public HourlyEmployee( String name,double hourlyRate,int hoursWorked) {
		super(name,0);
		this.hourlyRate=hourlyRate;
		this.hoursWorked=hoursWorked;
		
	}
	@Override
	public  String getEmployeeDetails() {
		return super.getEmployeeDetails()+ ", Type: Hourly, Total Payment: " + (hourlyRate * hoursWorked);

	}
}

class SalaryEmployee extends Employee{

	public SalaryEmployee(String name, double salary) {
		super(name, salary);

	}
	@Override
	public  String getEmployeeDetails() {
		return super.getEmployeeDetails()+ ", Type: Salaried";

	}
	
	
}

public class GetEmployeeDetails {
public static void main(String[] args) {
	Employee emp1=new HourlyEmployee("Kokila",15,540);
	System.out.println(emp1.getEmployeeDetails());
}
}
