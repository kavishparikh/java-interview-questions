import java.io.*;
import java.util.*;

public class Practise{

	public static void main(String args[]){

		try{
			Scanner in = new Scanner(System.in);
			int num=0;
			
			int i=0;
			
			do{
				System.out.println("Enter your choice\n1. Star Pattern\n2. Number Pattern\n3. Checking Division and Modulo operation\n4. FizzBizz Problem\n5. Fibbonacci series\n6. Reverse a string\n7. Swap Numbers without temp");
				System.out.println("----------------");
				int ch = in.nextInt();
				i++;
				switch(ch){
					case 1 :
						System.out.println("Enter the number of rows you need");
						num = in.nextInt();
						drawStarPattern(num);
						break;
					case 2 :
						System.out.println("Enter the number of rows you need");
						num = in.nextInt();
						drawNumberPattern(num);
						break;
					case 3 :
						checkDivModOperation();
						break;
					case 4 :
						fizzBizz();
						break;
					case 5 :
						System.out.println("How many fibbonacci numbers?");
						num = in.nextInt();
						fibbonacci(num);
						break;
					case 6 :
						System.out.println("Enter string to be reversed");
						String str = "It is a sunny day!";
						//in.nextLine();
						reverseString(str);
						//System.out.println(rstr);
						//rstr = reverseStringRecursively(str);
						//System.out.println(rstr);
						break;
					case 7 :
						int a = 10, b=20;
						swapNumberWithoutTemp(a, b);
						break;
					default:
						System.out.println("Invalid input, please try again!");
						//System.exit(0);
						break;
				}	
			}while(i < 5);
		}catch(Exception e){
			System.out.println("Exception caught");
		}finally{
			System.out.println("Exiting the program");
		}
		
	}

	public static void drawStarPattern(int num){
		for(int i=0; i< num; i++){
			for(int j=i; j>=0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void drawNumberPattern(int num){
		int k=0;
		for(int i=0; i< num; i++){
			for(int j=i; j>=0; j--){
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

	public static void checkDivModOperation(){
		int a=10, b=3;
		System.out.println("Dividing 10/3 gives : "+(10/3));
		System.out.println("Modulo 10%3 gives : "+(10%3));
	}	

	public static void fizzBizz(){
		System.out.println("Solving fizzBizz problem");
		for(int i=1; i<=50; i++){
			if(i% (3*5) == 0)System.out.println("FizzBizz");
			else if(i%3 == 0)System.out.println("Fizz");
			else if(i%5 == 0)System.out.println("Bizz");
			else System.out.println(i);
		}
	}

	public static void fibbonacci(int num){
		int[] arr = new int[num];
		int first =0, second=1;
		//int counter;
		for(int i=0; i<(num-1); i++){
			int temp = first+second;
			arr[i]= first;
			arr[i+1]= second;
			first = second;
			second= temp;
		}
		for(int x : arr)
			System.out.print(x+", ");
		System.out.println();
	}

	public static void reverseString(String str){
		//String rstr = str.reverse().toString();
		String rstr = "";
		int slength = str.length()-1;
		System.out.println("String length : "+slength);
		for(int i=slength; i >=0; i--){
			rstr = rstr+str.charAt(i);
		}
		System.out.println(rstr);
	}

	// public static String reverseStringRecursively(String str){
	// 	System.out.println("Reversing the String recursively");
	// 	if(str.length() < 2)
	// 		return str;
	// 	return reverseStringRecursively(str.subString(1)) + str.charAt(0);
	// }

	public static void swapNumberWithoutTemp(int a, int b){
		System.out.println("Swapping number without using temp variable");
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The swapped numbers : A "+a+" ; B "+b);

		System.out.println("Distance between 2 words");
		int distance = -1;
		distance = (a-b)-1;
		System.out.println("Distance : "+distance);
	}

}