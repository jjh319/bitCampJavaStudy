package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	
	public static void main(String[] args) {
		
		String[] groupA = { "우즈베키스탄" , "쿠웨이트" , "사우디" , "대한민국" };
		Stack<String> st = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) {
			st.push(groupA[i]);
		} // for
		
		while(!st.isEmpty()) {
			out.println(st.pop());
		} // while

	} // main

} // end class
