import java.util.Scanner;
import java.util.Stack;


public class Parenthesis {
    private static final char roundOpen    = '(';
    private static final char roundClose    = ')';
    private static final char curlyOpen    = '{';
    private static final char curlyClose    = '}';
    private static final char squareOpen  = '[';
    private static final char squareClose  = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == roundOpen || s.charAt(i) == curlyOpen || s.charAt(i) == squareOpen)   
            	   stack.push(s.charAt(i));
	
            else if (s.charAt(i) == roundClose) {
                if (stack.isEmpty())        
                  return false;
                if (stack.pop() != roundOpen) 
                  return false;
            }

            else if (s.charAt(i) == curlyClose) {
                if (stack.isEmpty())        
                  return false;
                if (stack.pop() != curlyOpen) 
                  return false;
            }

            else if (s.charAt(i) == squareClose) {
                if (stack.isEmpty())        
                  return false;
                if (stack.pop() != squareOpen) 
                  return false;
            } else {
              continue;
            }

            // ignore all other characters

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	 
        System.out.println("Enter a string");
        String s = in.nextLine();
    	boolean b = isBalanced(s);
        System.out.println(b);
    }

}