package basics;

public class JavaFunctions {
	
	public static void main(String args[]){
		
		int a=20, b=10;
		int m = max(a,b);
		System.out.println("The greater number is : "+m);
		System.out.println("---------------------");
		printGrade(86);
	}

	
	public static int max(int num1, int num2){
		int result;
		if(num1 > num2){
			result = num1;
		}
		else{
			result = num2;
		}
		return result;
	}
	
	public static void printGrade(int score){
		if(score > 90)
			System.out.println("You have A grade.");
		else if(score > 80)
			System.out.println("You have B grade.");
		else if(score > 70)
			System.out.println("You have C grade.");
		else
			System.out.println("You failed");
	}
}
