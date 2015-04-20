import java.io.*;
import java.util.*;

public class CheckArrayList{

	public static void main(String args[]){

		try{
			//trying with integers
			List<Integer> list = new ArrayList<Integer>();

			list.add(5);
			list.add(8);
			list.add(1);
			list.add(6);
			list.add(3);
			//list.add("Hi");
			//NOTE : Passing a string while defining an ArrayList as Integer will throw an error.

			System.out.print("Content of ArrayList : ");
			System.out.println(list);
			System.out.println("Size of ArrayList : "+list.size());	

			//Removes the content from index 1, and not the value 1.
			list.remove(1);
			System.out.print("Content of ArrayList : ");
			System.out.println(list);
			System.out.println("Size of ArrayList : "+list.size());

			//trying with strings
			System.out.println("--------------------");
			List<String> strlist = new ArrayList<String>();

			strlist.add(0, "Hi");
			strlist.add(1, "everyone");
			strlist.add(2, "how");
			strlist.add(3, "are");
			strlist.add(4, "yall?");
			//strlist.add(10);
			//NOTE : Passing a integer while defining an ArrayList as String will throw an error.

			System.out.print("Content of ArrayList : ");
			System.out.println(strlist);
			System.out.println("Size of ArrayList : "+strlist.size());	

			strlist.set(1, "guys");
			System.out.print("Content of ArrayList : ");
			System.out.println(strlist);
			System.out.println("Size of ArrayList : "+strlist.size());

			strlist.remove("Hi");
			System.out.print("Content of ArrayList : ");
			System.out.println(strlist);
			System.out.println("Size of ArrayList : "+strlist.size());
		
		}catch(Exception e){
			System.out.println("Exception caught");
			e.printStackTrace();
		}

	}

}