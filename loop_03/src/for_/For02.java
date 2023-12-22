package for_;

import java.io.IOException;

public class For02 {
	
	public static void main(String[] args) throws IOException {
		
		// 문제 : 원하는 구구단을 System.in.read() 를 사용하여 출력하시오.
		
		System.out.print("원하는 단을 입력 : ");
		int dan =  System.in.read() - 48;
		
		System.out.println( dan + "단");
		for(int i=1; i<10;  i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			
		} // for 
		
		
	} // main

} // end class
