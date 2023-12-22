package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	
	public static void main(String[] args) {  // 월급 계산 프로그램 문제
		 
		int salary;  // 월급
		int sum;    // 합계
		int segum;  // 세금
		
		DecimalFormat df = new DecimalFormat();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.next();  // 이름
		
		System.out.print("직급 입력 : ");
		String depart = sc.next(); // 직급
		
		System.out.print("기본급 입력 : ");
		int gMoney = sc.nextInt(); // 기본급
		 
		System.out.print("수당 입력 : ");
		int nMoney = sc.nextInt(); // 수당
		System.out.println();
		
		
		System.out.println("*** " + name + " " + depart + " 월급 ***");
		
		System.out.println("기본급 : " + df.format(gMoney) );
		System.out.println("수당 : " + df.format(nMoney) );
		
		sum = gMoney + nMoney;
		System.out.println("합계 : " + df.format(sum) );
		
		segum = (int) ( sum >= 5000000 ? sum*0.03 : ( sum >= 3000000 ? (sum*0.02) : (sum*0.01) ) );
		System.out.println("세금 : " + df.format(segum) );
		
		salary = sum - segum;
		System.out.println("월급 : " + df.format(salary));

	} // main

} // end class


/*

	[문제] 월급 계산 프로그램 - 조건 연산자 이용
	이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
	단 합계가 5,000,000원 이상이면 3%
	       3,000,000원 이상이면 2%
	       아니면 1%
	
	숫자는 3자리마다 , 표시
	
	소수이하는 표시하지 않는다.
	       
	합계 = 기본급 + 수당
	세금 = 합계 * 세율
	월급 = 합계 - 세금

	
	[실행결과]
	이름 입력 : 홍길동
	직급 입력 : 부장
	기본급 입력 : 4900000
	수당 입력 : 200000
	
	*** 홍길동 부장 월급 ***
	기본급 : 4,900,000원
	수당 : 200,000원
	합계 : 5,100,000원
	세금 : 153,000원
	월급 : 4,947,000원

*/