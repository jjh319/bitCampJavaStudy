package homework;

import java.io.IOException;

public class OperatorInput {

	
	public static void main(String[] args) throws IOException {
		
		// 소문자,대문자 변환 문제
		char ch;
		ch =  (char) System.in.read();
		System.out.println(
				ch == Character.toLowerCase(ch) ? 
						Character.toUpperCase(ch) : Character.toLowerCase(ch));
		
		
		
	} // main

} // end class


/*

	[문제] 문자를 입력하여 대문자이면 소문자로 변경 후 출력하고
	만약에 대문자가 아니면 대문자로 변경 후 출력하시오
	
	[조건]
	System.in.read(), 조건연산자를 사용하시오
	
	[실행결과]
	문자 입력 : T
	T -> t
	
	또는 
	
	문자 입력 : e
	e -> E

*/