import java.io.*;
import java.util.*;

public class StackExample{

	public static void main(String args[]){
		Stack st = new Stack();
		System.out.println("Stack : "+st);
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println("Stack : "+st);
		st.pop();
		System.out.println("Stack : "+st);
		
	}

}