import java.io.*;
import java.util.*;

public class DrawPatterns{

	public static void main(String args[]){

		try{
			// NOTE : a scanner is not thread safe compared with BufferedReader
			Scanner in = new Scanner(System.in);
			
			int i=0;
			System.out.println("Enter the number of rows you need");
			int num = in.nextInt();

			do{
				System.out.println("Enter your choice\n1. Star Pattern\n2. Number Pattern\n3. Checking Division and Modulo operation");
				int ch = in.nextInt();
				i++;
				switch(ch){
					case 1 :
					drawStarPattern(num);
					break;
					case 2 :
					drawNumberPattern(num);
					break;
					case 3 :
					checkDivModOperation();
					break;
					default:
					System.out.println("Invalid input, please try again!");
					System.exit(0);
					break;
				}	
			}while(i < num);
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

}