package homework;

import java.util.Scanner;

public class BaseBall {

	
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      
	      int strike = 0;
	      int ball = 0;
	      
	      int[] ar = new int[3]; // 랜덤숫자 넣는 배열
	      int[] input = new int[3]; // 입력해서 넣을 배열
	      
	      while(true) {
	         
	         System.out.print("게임을 실행하시겠습니까(Y/N : ");
	         String ans = sc.next();
	         
	         if(ans.equals("Y") || ans.equals("y")) {
	            System.out.println("게임을 시작합니다.");
	         } else if(ans.equals("N") || ans.equals("n")) {
	            System.out.println("게임을 종료합니다");
	            break;
	         } else {
	            System.out.println("Y/N 만 입력하세요.");
	            continue;
	         } // if-else if-else
	         
	         while(true) {
	            
	            for(int i=0; i<ar.length; i++) {
	               int random = (int) (Math.random() * 9 + 1);
	               ar[i] = random;
	               for(int j=0; j<i; j++) {
	                  
	                  if(ar[i] == ar[j]) {
	                     i--;
	                     break;
	                  } // if
	                  
	               } // inner for
	            } // for
	            
	            
	          
	            
	            System.out.print("중복되지 않는 3자리 수(1~9) : ");
	            String number = sc.next();
	            
	            String s1 = number.substring(0,1);
	            String s2 = number.substring(1,2);
	            String s3 = number.substring(2);
	            
	            input[0] = Integer.parseInt(s1);
	            input[1] = Integer.parseInt(s2);
	            input[2] = Integer.parseInt(s3);
	            
	            for(int i=0; i<input.length; i++) {
	               
	               for(int j=0; j<i; j++) {
	                  
	                  if(input[i] == input[j]) {
	                     System.out.println("중복된 값이 있습니다.");
	                     return;
	                  } // if
	                  
	               } // inner for
	            } // for
	            
	            for(int i=0; i<ar.length; i++) {
	               for(int j=0; j<ar.length; j++) {
	                  if(input[i] == ar[j]) {
	                     if(i == j) {
	                        strike++;
	                     } else {
	                        ball++;
	                     } // inner if-else
	                     
	                  } // if
	                  
	               } // inner for
	            } // for
	            
	            if(ball == 4) {
	               strike++;
	               ball = 0;
	            } // if
	            
	            System.out.println(strike + "스트라이크 " + ball + "볼");
	            
	            if(strike == 3) {
	               System.out.println("프로그램을 종료합니다");
	               break;
	            } // if
	            
	         } // inner while
	         
	         
	         break;
	      } // while



	} // main

} // end class

/*

	[문제] 야구게임
	크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
	발생한 수를 맞추는 게임
	중복은 제거한다
	
	[실행결과]
	게임을 실행하시겠습니까(Y/N) : w
	게임을 실행하시겠습니까(Y/N) : u
	게임을 실행하시겠습니까(Y/N) : y
	
	게임을 시작합니다
	
	숫자입력 : 123
	0스트라이크 0볼
	
	숫자입력 : 567
	0스트라이크 2볼
	
	숫자입력 : 758
	1스트라이크 2볼
	...
	
	숫자입력 : 785
	3스트라이크 0볼
	
	프로그램을 종료합니다.

*/