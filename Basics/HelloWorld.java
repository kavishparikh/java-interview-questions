package basics;

import java.io.*;

public class HelloWorld {
	public static void main(String arg[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//PRINT MESSAGE
		System.out.println("Hello People...m back on JAVA after a long hiatus!!!");
		
		//ADD 2 NUMBERS
		int a =10;
		int b=9;
		int c= a+b;
		System.out.println(c);
		
		//DISPLAY AN ARRAY
		int arr[]= new int[10];
		for(int i=0; i<10 ; i++)
		{
			arr[i] = i;
		}
		for(int x: arr)
		{
			System.out.println("The Array element : "+x);
		}
		
		//PATTERNS
		for(int i=0; i<5;i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//CHECKING OUT ASCII CHARACTERS
		char A= 'A';
		System.out.println("The Char is : "+ A);
		System.out.println("The ASCII calue is : "+(int)A);	
		
		//CHAR TO STRING
		char[] helloChar ={'h', 'e', 'l', 'l', 'o','.'};
		for(char x : helloChar){
			System.out.println(x);
		}
		String helloString = new String(helloChar);
		System.out.println(helloString);
		System.out.println("The lenght of string is : "+helloString.length());
		String string1 = "people!";
		System.out.println(helloString.concat(string1));
	}
}

