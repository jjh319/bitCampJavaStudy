package if_;

import java.util.Scanner;

public class If03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		
		if(a < b && a < c) {
			
			if(b < c) {
				System.out.println(a + " " + b + " " + c);
			} else if(c < b) {
				System.out.println(a + " " + c + " " + b);
			} // if-else if
			
		} else if(b < a && b < c) {
			if(a < c) {
				System.out.println(b + " " + a + " " + c);
			} else if(c < a) {
				System.out.println(b + " " + c + " " + a);
			} // if-else if
		} else if(c < a && c < b) {
			if(a < b) {
				System.out.println(c + " " + a + " " + b);
			} else if(b < a) {
				System.out.println(c + " " + b + " " + a);
			} // if-else if
			
		} // if-else if
		
	} // main

} // end class


/*

	3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)
	
	[실행결과]
	a의 값 : 98
	b의 값 : 90
	c의 값 : 85
	
	85 90 98
	
	a의 값 : 75
	b의 값 : 25
	c의 값 : 36
	
	25 36 75

*/