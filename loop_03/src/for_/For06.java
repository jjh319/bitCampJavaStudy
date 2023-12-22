package for_;

import java.util.Scanner;

public class For06 {

	
	public static void main(String[] args) { // 팩토리얼 문제
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("1~9 까지의 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 && num >= 10) {
			continue;
		} else if(num > 0) {
			int mul = 1;
			
			for(int i=1; i<num; i++) {
				mul = mul*i;
			} // for
			System.out.println(num + "! = " + mul );
			
		} else if(num == 0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} // if-else if
		
		} // while
		
	} // main

} // end class

/*

	[문제] 팩토리얼을 구하시오
	- 음수가 입력되면 다시 입력을 받는다.
	- 0이 입력되면 프로그램을 종료한다.
	- 숫자는 1부터 10까지만 입력한다.
	
	[실행결과]
	숫자 입력 : 3
	3! = 6 (123)
	
	숫자 입력 : -3
	숫자 입력 : -5
	숫자 입력 : 5
	5! = 120
	
	숫자 입력 : 0
	프로그램을 종료합니다.

*/