import java.io.*;
import java.util.*;

public class SimpleInheritanceA{

	public static void main(String args[]){

		System.out.println("This is Inheritance class A");
		String lname = "Bond";
	}
}

public class SimpleInheritanceA extends SimpleInheritanceB{

		System.out.println("This is Inheritance class A");
		printName(lname);
		

	public void printName(String name){

		System.out.println("The name is bond, James "+name);
	}
}

