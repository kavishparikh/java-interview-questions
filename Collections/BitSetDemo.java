//package DataStructures;

import java.util.*;

public class BitSetDemo {
	
	public static void main(String args[]){
		BitSet bits1 = new BitSet();
		BitSet bits2 = new BitSet();
		
		//setting bits
		for(int i=0; i<16; i++){
			if((i%2) == 0) bits1.set(i);
			if((i%5) != 0) bits2.set(i);
		}	
		
		System.out.println("Initial pattern for bits1 :");
		System.out.println(bits1);
		System.out.println("Initial pattern for bits2 :");
		System.out.println(bits2);
		
		//AND bits
		System.out.println("\nbits1 AND bits2 :");
		bits1.and(bits2);
		System.out.println(bits1);
		
		//OR bits
		System.out.println("\nbits1 OR bits2 :");
		bits1.or(bits2);
		System.out.println(bits1);
		
	}
	
}
