package exception;

import java.util.Scanner;

public class ExceptionMain2 {

	Scanner sc = new Scanner(System.in);
	private int x;
	private int y;
	
	
	public void input() {
		System.out.print("x 입력 : ");
		this.x = sc.nextInt();
		
		System.out.print("y 입력 : ");
		this.y = sc.nextInt();
		
		output();
		
	} // input
	
	public void output() {
		int num = 1;
		
		if( y >= 0) {
			for(int i=1; i<=y; i++) {
				num *= x;
			} // for
			
			System.out.println(x + "의 " + y + "승은 " + num);
		
		} else {
//			System.out.println("y는 0보다 크거나 같아야 한다.");
			
			try {
				// 강제로 Exception 발생
				throw new Exception("y는 0보다 크거나 같아야 한다.");
			
			} catch(Exception e) {
				e.printStackTrace();
			} // try-catch
			
		} // if-else
		
	} // output
	
	

	public static void main(String[] args) {
		
		ExceptionMain2 em = new ExceptionMain2();
		em.input();

	} // main

} // end class

/*

	[문제] 제곱 연산
	- x의 y승을 처리 한다.
	
	[실행결과]
	x 입력 : 2
	y 입력 : 10			input()
	----------------------------------
	2의 10승은 xxx        output()

*/