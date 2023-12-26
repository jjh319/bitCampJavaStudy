package homework;

import java.util.Scanner;

public class Lotto {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] lotto = new int[6];
		boolean play = true;
		
		while(play) {
			
			System.out.print("현금 입력 (1000원 단위): ");
			int money = sc.nextInt();
			
			if(money % 1000 != 0) {
				System.out.println("천원 단위로만 입렵하세요.");
				continue;
			} // if
			
			for(int k=0; k< (money / 1000); k++) { // 구매 횟수
			
				for(int i=0; i<lotto.length; i++) {  // 중복 숫자 제거
					int randomNum = (int) (Math.random() * 44 + 1);
					
					for(int j=0; j<i; j++) {
						
						if(lotto[j] == randomNum ) {
							i--;
							break;
						} // if
						
					} // inner for
					
					lotto[i] = randomNum;		
					
				} // 중복제거 for
				
				for(int i=0; i<lotto.length-1; i++) {  // 뽑은 숫자 오름차순 정렬
					for(int j=i+1; j<lotto.length; j++) {
						
						if(lotto[i] > lotto[j]) {
							int temp = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = temp;
						} // if
					} // inner for
					
					
				} // 오름차순 정렬 for
				
				if(k % 5 == 0) {  // 5천원 초과 구매시 한장 더 
					System.out.println();
				} // if
				
				for(int i=0; i<lotto.length; i++) {
					System.out.print(lotto[i] + "  ");
				} // for
			System.out.println();
			
			
			} // 구매 횟수 for
			play = false;
			
		} // while

	} // main

} // end class

/*

	[문제] 로또 프로그램
	1~45 사이의 난수를 6개 발생한다.
	단, 숫자는 중복이 되어서는 안된다.
	1줄당 금액이 천원이다.
	
	[실행결과]
	현금 입력 : 3000
	    2    4   19   39   43   44
	   22   26   33   38   39   42
	    5    6    8   25   35   45
	    
	현금 입력 : 7000    
	   2    4   19   39   43   44
	   22   26   33   38   39   42
	    5    6    8   25   35   45
	    3   14   23   30   34   35
	   18   20   25   27   32   37
	
	    1   16   32   34   41   42
	    5    6   18   30   33   44

*/