import java.io.*;
import java.util.*;
import SimpleInheritanceA.*;

public class SimpleInheritanceB extends SimpleInheritanceA{

	public static void main(String args[]){

		System.out.println("This is Inheritance class B");
		
		printName(lname);

	}

	public void printName(String name){

		System.out.println("The name is bond, James "+name);
	}
}