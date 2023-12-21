package operator;

import java.util.Scanner;

public class Operator01 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 동전 갯수 구하기 문제
		
		System.out.print("현금 입력 : ");
		int money = sc.nextInt();
		
		int chun = money / 1000;
		System.out.println("1000원 : " + chun);
		
		int hun = (money - chun*1000) / 100;
		System.out.println("100원 : " + hun);
		
		int ten = (money - chun*1000 - hun*100) / 10;
		System.out.println("10원 : " + ten);
		
		int one = (money - chun*1000 - hun*100 - ten*10) / 1;
		System.out.println("1원 : " + one);
		
	} // main

} // end class


/*
	
	[문제] 동전 교환
	현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
	
	[실행결과]
	현금 입력 : 5723
	천원 : 5장
	백원 : 7개
	십원 : 2개
	일원 : 3개

*/