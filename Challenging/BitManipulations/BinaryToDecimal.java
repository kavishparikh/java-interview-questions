import java.io.*;
import java.util.*;

public class BinaryToDecimal {
	public static void main(String args[]) {
		int signed binaryNumber = 1100;
		int number = printDecimal(binaryNumber);
		System.out.println("Decimal number for " + binaryNumber + " is : " +number);
	}

	public static int printDecimal(int binaryNumber) {
		int decimal = 0;
		int binary = binaryNumber;
		int power = 0;
		while(binary != 0) { // can also be solved using for loop
			int lastDigit = binary%10;
			if(lastDigit != 0 && lastDigit != 1) {
				System.out.println("This is not a binary number, Please try again");
				System.exit(0);
			}
			decimal += lastDigit * Math.pow(2, power++);
			binary = binary/10;
		}
		return decimal;
	}
}