package array;

import java.util.Scanner;

public class Array05 {

	
	public static void main(String[] args) {
		
		boolean play = true;
		
		Scanner sc = new Scanner(System.in);
		
		boolean[] list = new boolean[5];
		
		while(play) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("**********************");
			System.out.println("1.입차  2.출차  3.리스트  4.종료");
			System.out.println("**********************");
			System.out.println();
			
			
			
			System.out.print("선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 : 
					System.out.print("위치 입력 : ");
					int jucha = sc.nextInt();
					
					System.out.println(jucha + "위치에 입차합니다.");
					
					if(list[jucha-1] == false) {
						list[jucha-1] = true;
						System.out.println("주차가 완료되었습니다.");
					} else if(list[jucha-1] == true){
						System.out.println("이미 주차되었습니다.");
						continue;
					} // if-else
					
					break;
				case 2 :
					System.out.print("위치 입력 : ");
					int chul = sc.nextInt();
					
					System.out.println(chul + "위치에 출차합니다.");
					
					if(list[chul-1] == true) {
						System.out.println("출차가 완료되었습니다");
						list[chul-1] = false;
					} else {
						System.out.println("주차되어 있지 않습니다.");
						continue;
					} // if-else
			
					break;
				case 3 :
					System.out.println("주차 현황");
					
					for(int i=0; i<list.length; i++) {
						System.out.println( i+1 + "위치 : " + list[i]);
					}// for
					break;
				case 4 :
					System.out.println("프로그램을 종료합니다.");
					play = false;
					break;
				default : 
					System.out.println("제대로 된 숫자를 입력하세요.");
					return;
			} // switch
			
			
		} // while
		
	} // main

} // end class

/*

	주차장 관리 프로그램
	**************
	   1. 입차
	   2. 출차
	   3. 리스트
	   4. 종료
	**************
	  메뉴 : 
	
	1번인 경우
	위치 입력 : 3
	3위치에 입차 / 이미 주차되어있습니다
	
	2번인 경우
	위치 입력 : 4
	4위치에 출차 / 주차되어 있지않습니다
	
	3번인 경우
	1위치 : true
	2위치 : false
	3위치 : true
	4위치 : false
	5위치 : false

*/