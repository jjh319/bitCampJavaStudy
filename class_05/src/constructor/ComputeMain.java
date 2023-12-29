package constructor;

import java.util.Scanner;

public class ComputeMain {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Compute[] computes = new Compute[3];
		
		int[] num1 = new int[computes.length];
		int[] num2 = new int[computes.length];
		
			
			
		for(int i=0; i<computes.length; i++) {
			System.out.print("x값 입력 : ");
			int x = sc.nextInt();
			
			num1[i] = x;
			
			
			System.out.print("y값 입력 : ");
			int y = sc.nextInt();
			num2[i] = y;
			System.out.println();
			
			computes[i] = new Compute(num1[i], num2[i]);
			
			computes[i].calc();
		} // for
			
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		
		for(int i=0; i<computes.length; i++) {
			System.out.println(computes[i].getX() + "\t" + computes[i].getY() + "\t" + 
							   computes[i].getSum() + "\t" + computes[i].getSub() + "\t" + 
							   computes[i].getMul() + "\t" + 
							   String.format("%.2f",computes[i].getDiv())
					);
			
			
		} // for
		
		
		
	} // main

} // end class

/*

	[문제] 합, 차, 곱, 몫을 구하시오
	- main 함수에서 데이터를 입력 받는다.
	- 몫은 소수이하 2째자리까지 처리
	- 객체 배열
	
	클래스명 : Compute
	필드   : x, y, sum, sub, mul, div
	메소드  : 생성자(x, y)
	        calc() - 합, 차, 곱, 몫을 계산
	        getX()
			getY()
			getSum()
			getSub()
			getMul()
			getDiv()
	
	[실행결과]
	x 입력 : 320
	y 입력 : 258
	
	x 입력 : 256
	y 입력 : 125
	
	x 입력 : 452
	y 입력 : 365
	
	
	X		Y		SUM		SUB		MUL		DIV
	320		258
	256		125
	452		365

*/