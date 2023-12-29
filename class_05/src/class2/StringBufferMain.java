package class2;

import java.util.Scanner;

public class StringBufferMain {

	private int dan;
	
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		StringBuffer buffer = new StringBuffer();
		
		System.out.print("원하는 단을 입력 : ");
		dan = sc.nextInt();
		
		for(int i = dan; i<dan+1; i++ ) {
			System.out.println(i + "단");
			for(int j = 1; j<10; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
				buffer.append(i);
				buffer.append(" * ");
				buffer.append(j);
				buffer.append(" = ");
				buffer.append(i*j);
				System.out.println(buffer.toString());
				buffer.delete(0, buffer.length());
				
			} // inner for
		} // for
		
	} // display
	
	public static void main(String[] args) {
		
		StringBufferMain st = new StringBufferMain();
		st.display();

	} // main

} // end class

/*

	원하는 단을 입력 : 2
	
	2*1=2
	2*2=4
	...

*/