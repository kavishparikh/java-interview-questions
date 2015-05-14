import java.io.*;
import java.util.*;

// Question : Calculate the combination of three digits number consisting   
// 			  of 0-9, and no duplicate is allowed.

public class ThreeDigitCombination {

	public static void printCombination(int num){
        int combinationCount = 0;
        for (int i=0; i<num; i++) {
            for (int j=i+1; j<num; j++) {
                for (int k=j+1; k<num; k++) {
                    System.out.println( i + " " + j + " " + k );
                    combinationCount++;
                }
            }
        }
        System.out.println(combinationCount);

    }


	public static void main(String[] args) {
		// The digits should be between 0 and 9, thus 10
		printCombination(10);
	}

}