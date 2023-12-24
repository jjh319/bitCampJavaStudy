package homework;


public class RSPGame {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 1000; // 기본금 천원
		int chip = 100; // 배팅금
		int cnt = 0; // 이긴 횟수
		
		System.out.println("게임을 시작합니다.");
		System.out.println();
		
		while(money >= 0) {
			
			// 가위(1) 바위(2) 보자기(3) , 무승부시 패배처리
			int a = (int) (Math.random() * 3 + 1); 
			
			System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
			int user = sc.nextInt();
			sc.nextLine(); // 숫자 입력 후 엔터를 소비하기 위함
			System.out.println();
			
			
			if(user > 3 || user < 0) {
				System.out.println("1 부터 3 까지의 숫자만 입력하세요.");
				continue;
			} // if
			
			System.out.println("배팅 금액 : " + chip);
			System.out.print("결과를 보시려면 Enter를 치세요. ");
			sc.nextLine(); // 엔터를 기다림
			
			System.out.println();
			
			if(a == user) {
				switch(a) {
					case 1 :
						System.out.println("컴퓨터 가위, 나는 가위");
						System.out.println("무승부입니다.  ㅠㅠ..졌다.");
						money -= chip;
						System.out.printf("현재 금액은 %d원", money);
						break;
					case 2 :
						System.out.println("컴퓨터 바위, 나는 바위");
						System.out.println("무승부입니다.  ㅠㅠ..졌다.");
						money -= chip;
						System.out.printf("현재 금액은 %d원", money);
						break;
					case 3 :
						System.out.println("컴퓨터 보자기, 나는 보자기");
						System.out.println("무승부입니다.  ㅠㅠ..졌다.");
						money -= chip;
						System.out.println("현재 금액은 " + money + "원");
						break;
				} // switch
				
			} else if(a == 1 && user == 2) {
				System.out.println("컴퓨터 가위, 나는 바위");
				System.out.println("야~호 이겼다.");
				cnt++;
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
				
			} else if(a == 1 && user == 3) {
				System.out.println("컴퓨터 가위, 나는 보자기");
				System.out.println("ㅠㅠ..졌다.");
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
			} else if(a == 2 && user == 1) {
				System.out.println("컴퓨터 바위, 나는 가위");
				System.out.println("ㅠㅠ..졌다.");
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
			} else if(a == 2 && user == 3) {
				System.out.println("컴퓨터 바위, 나는 보자기");
				System.out.println("야~호 이겼다.");
				cnt++;
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
			} else if(a == 3 && user == 1) {
				System.out.println("컴퓨터 보자기, 나는 가위");
				System.out.println("야~호 이겼다.");
				cnt++;
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
			} else if(a == 3 && user == 2) {
				System.out.println("컴퓨터 보자기, 나는 바위");
				System.out.println("ㅠㅠ..졌다.");
				money -= chip;
				System.out.printf("현재 금액은 " + money + "원");
			}  // if-else if
			System.out.println();
			
			if(money == 0) {
				System.out.println("총 " + cnt + "번 이기셨습니다!");
				
				while(true) {
				System.out.print("또 할래? (Y/N) : ");
				String ans = sc.next();
				
				if(ans.equals("N") || ans.equals("n")) {
					System.out.println("프로그램을 종료합니다.");
					money = -100;
					break;
				} else if(ans.equals("Y") || ans.equals("y")) {
					System.out.print("insert coin : ");
					int life = sc.nextInt();
					money = life;
					break;
				} else {
					System.out.println("Y(y) 또는 N(n) 만 입력하세요.");
					continue;
				} // if-else if-else
				
				} // while
				
			} // if
			
			System.out.println();	
			
		} // while
		
		sc.close();
		
	} // main

} // end class

/*

	[문제] 가위 바위 보 게임
	- 가위(1), 바위(2), 보자기(3)으로 설정한다.
	- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
	- 기본 금액은 1000원을 기본으로 설정한다.
	- 돈이 떨어지면(0 이하이면) 게임을 계속할지 물어보고 계속하려면 현금 입력을 받고 다시 게임을 한다.
	
	[실행결과]
	가위(1), 바위(2), 보자기(3) 입력 : 1
	배팅 금액 : 100
	결과를 보시려면 Enter를 치세요
	
	컴퓨터 바위, 나는 가위
	ㅠㅠ..졌다
	현재 금액은 900윈
	---------------------
	
	가위(1), 바위(2), 보자기(3) 입력 : 1
	배팅 금액 : 100
	결과를 보시려면 Enter를 치세요
	
	컴퓨터 보자기, 나는 가위
	야~호 이겼다.
	현재 금액은 -100윈
	
	또 할래 (y/n) : n
	프로그램을 종료합니다.
	
	또는
	또 할래 (y/n) : y
	insert coin :

*/
