package while_;

import java.util.Scanner;

public class Game {

	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 100 사이의 숫자를 맞추세요.");
		
		int com = (int) (Math.random() * 100 + 1 );
		int cnt = 1;  // 카운트
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int user = sc.nextInt();
			
			if(user != com) {
				if(user > com) {
					System.out.println(user + "보다 작은 숫자입니다.");
					cnt++;
				} else if(user < com) {
					System.out.println(user + "보다 큰 숫자입니다.");
					cnt++;
				} // inner if-else if
				
			} else if(user == com) {
				System.out.println("딩동뎅! " + cnt + "번만에 맞추셨습니다!");
				break;
			} // if-else if
			
		} // while
		System.out.println("게임을 종료합니다.");
		
		
	} // main

} // end class

/*

	[문제] 숫자 맞추기 게임
	- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
	- 몇 번만에 맟주었는지 출력한다.
	
	[실행결과]
	1 ~ 100사이의 숫자를 맞추세요 (77)
	
	숫자 입력 : 50
	50보다 큰 숫자입니다
	숫자 입력 : 80
	80보다 작은 숫자입니다.
	~
	~
	숫자 입력 : 77
	딩동뎅...x번만에 맞추셨습니다

*/