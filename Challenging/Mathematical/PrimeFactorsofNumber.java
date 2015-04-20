import java.io.*;
import java.util.*;

public class PrimeFactorsofNumber {

	public Set primeFactors(int number) {
		long i;
		Set<> primeNumber = new HashSet<>();
		long numberCopy = number;

		for (int i=2; i<number; i++) {
			if(numberCopy%i == 0)
				primeNumber.add(i);
			numberCopy /= i;
			i--;
		}
		return primeNumber;
	}


	public static void main(String[] args) {
		System.out.println("The prime factors of entered number : " + primeFactors(56)); 
	}

}