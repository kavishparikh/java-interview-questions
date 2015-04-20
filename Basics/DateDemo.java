//package basics;

import java.util.*;
import java.text.*;

public class DateDemo {
	
	public static void main(String args[]){
		Date date = new Date();
		Scanner in =new Scanner(System.in);
		
		//Displaying date
		System.out.println(date.toString());
		
		System.out.println("----------------------");
		//Date formtting
		//E 	- Day in week
		//yyyy 	- Year in four digit
		//a 	- Am/PM marker
		//zzz	- Time zone
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date : "+ft.format(date));
		
		//Sleep Demo
		System.out.println("----------------------");
		try{
			System.out.println(new Date() + "\n");
			Thread.sleep(5*60*10);
			System.out.println(new Date() + "\n");
		} catch(Exception e){
			System.out.println("Got an exception!");			
		}
		
		System.out.println("----------------------");
		//Gregorian Calender
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("Enter a year");
		int year = in.nextInt();
		if(gc.isLeapYear(year)){
			System.out.println("The current year is a leap year");
		}
		else{
			System.out.println("The current year is not a leap year");
		}
	}

}