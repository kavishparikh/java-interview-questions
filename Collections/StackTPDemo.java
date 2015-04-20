//package DataStructures;

import java.util.*;

public class StackTPDemo {
	
	public static void showPush(Stack s, int i){
		s.push(new Integer(i));
		System.out.println("Stack : "+s);
	}
	
	public static void showPop(Stack s){
		s.pop();
		System.out.println("Stack : "+s);
	}
	
	public static void main(String args[]){
		Stack st = new Stack();
		System.out.println("Stack : "+st);
		
		showPush(st, 44);
		showPush(st, 66);
		showPush(st, 88);
		
		System.out.println(st.peek());
				
		try{
			showPop(st);
			showPop(st);
			showPop(st);
			showPop(st);
		}catch(Exception e){
			System.out.println("Stack is empty");
			e.printStackTrace();
		}
		
	}
	
}
