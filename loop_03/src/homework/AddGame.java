package homework;

import java.util.Scanner;

public class AddGame {

	
	public static void main(String[] args) { // 덧셈 계산 게임 , 커밋 오류 테스트
		
		Scanner sc = new Scanner(System.in);
		
		boolean life = true;
		int num = 0; // 맞춘 문제 수
		int cnt = 2; // 기회
		int score = 0; // 점수
		
		while(life) {
			
			score = 0; // 다시 시작 시 점수 초기화
			
			for(int i=0; i<5; i++) {
				int a = (int) ( Math.random() * 90 + 10 );
				int b = (int) ( Math.random() * 90 + 10 );
				
				
				if(cnt <= 1) { // 기회 초기화
					cnt = 2;
				} // if
				
				while(true) {
					
				System.out.print(a + " + " + b + " = ");
				int sum = sc.nextInt();
				
				if(a + b == sum) {
					System.out.println("딩동댕!");
					num++;
					score += 20;
					break;
				} else if (a + b != sum) {
					
					cnt--;
					
					switch(cnt) {
						case 1 :
							System.out.println("틀렸다.");
							break;
						
						case 0 :
							System.out.println("틀렸다. 정답은" + (a+b) );
							cnt = 2;
							break;
					} // switch
					
					
					} // if-else if
				
				if(cnt == 2) {
					break;
				} // if
					
					
				} // inner while
				
				
			} // for
			
			System.out.println("당신은 총 " + num + "문제를 맞추어서 점수 " + score + "점 입니다.");
			System.out.println();
			
			System.out.print("또 할래?(Y/N) : ");
			String play = sc.next();
			
			if(play == "y" || play == "Y") {
				return;
			} else if(play == "n" || play == "N") {
				break;
			} // if-else if
			
			
		} // while
		
		
	} // main

} // end class

/*

	[문제] 덧셈 계산 (for, while, 다중 for)
	- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
	- 5문제를 제공한다.
	- 1문제당 점수 20점씩 처리한다.
	- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.
	
	[실행결과]
	[1] 25 + 36 = 50
	틀렸다
	[1] 25 + 36 = 59
	틀렸다 정답은 xx
	
	[2] 10 + 25 = 35
	딩동뎅
	
	[5] 78 + 95 = 89
	틀렸다
	[5] 78 + 95 = 173
	딩동뎅
	
	당신은 총 x 문제를 맞추어서 점수 xx점 입니다.
	
	또 할래(Y/N) : a
	또 할래(Y/N) : w
	또 할래(Y/N) : n
	
	프로그램을 종료합니다.

*/