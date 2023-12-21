package variable;

import java.io.IOException;


public class Input {

	
	public static void main(String[] args) throws IOException {
		
		System.out.print("정수 입력 : ");
		int a = System.in.read(); // 1개 입력
		
		System.in.read();  // 버퍼 비우기 처리 \r
		System.in.read();  // 버퍼 비우기 처리 \n
		
		System.out.print("정수 입력 : ");
		int b = System.in.read(); // 1개 입력
		
		System.out.println(a + " + " + b + " = " + (a+b) );
		
	} // main

} // end class
