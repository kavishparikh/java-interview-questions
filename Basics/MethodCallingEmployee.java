package basics;

public class MethodCallingEmployee {
	
	String name;
	double age;
	String designation;
	double salary;
	
	public MethodCallingEmployee(String name){
		this.name = name;
	}
	
	public void empAge(double empAge){
		age = empAge;
	}
	
	public void empDesig(String empDesig){
		designation = empDesig;
	}
	
	public void empSalary(double empSal){
		salary = empSal;
	}
	
	public void printEmployee(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Designation : "+designation);
		System.out.println("Salary : "+salary);
	}

}
