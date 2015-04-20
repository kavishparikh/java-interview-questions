import java.io.*;
import java.util.*;

class GreatestCommonDivisor{

	public static void main(String args[]){

		System.out.println("Finding greatest commom divisor : ");
		int num = gcd(10, 6);
		System.out.println("greatest commom divisor : "+num);
		
	}

	public static int gcd(int p, int q){
		if(q == 0) return p;
		int r = p%q;
		return gcd(q, r);
	}
}