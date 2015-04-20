package basics;

import java.io.*;

public class MethodCallingEmployeeTest {
	
	public static void main(String args[]){
		MethodCallingEmployee empOne = new MethodCallingEmployee("Kavish");
		MethodCallingEmployee empTwo = new MethodCallingEmployee("Hetvi");
		
		empOne.empAge(23);
		empOne.empDesig("Software Engineer");
		empOne.empSalary(100000);
		empOne.printEmployee();
		
		empTwo.empAge(20);
		empTwo.empDesig("Chartered Accountant");
		empTwo.empSalary(80000);
		empTwo.printEmployee();
	}

}
