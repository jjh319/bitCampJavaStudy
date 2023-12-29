package homework;

import java.util.Scanner;

public class Exam {

	Scanner sc = new Scanner(System.in);
	
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG="11111"; //상수화
	
	public Exam() {
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("답 입력 : ");
		dap = sc.nextLine();
		System.out.println();
		
		ox = new char[5];
		
		compare();
		
	} // Constructor
	
	
	public void compare() {
		
		for(int i=0; i<ox.length; i++) {
			
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20; 
			} else {
				ox[i] = 'X';
			} // if-else
			
		} // for
		
	} // compare
	
	
	
	public String getName() {
		return this.name;
	} // getName
	
	public char[] getOx() {
		return this.ox;
	} // getOx
	
	public int getScore() {
		return this.score;
	} // getScore
	
} // end class

/*
	[문제] 사지선다형
	- 총 5문제의 답을 입력받는다
	- 정답은 "11111" 이다
	- 맞으면 'O', 틀리면 'X'
	
	클래스명 : Exam
	* 필드
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG="11111"; //상수화
	
	* 메소드
	생성자 - Scanner 써서 이름, 답을 입력 받는다.
	compare() - 비교
	getName()
	getOx()
	getScore()
	
	클래스명 : ExamMain
	
	[실행결과]
	인원수 입력 : 3
	
	이름 입력 : 홍길동
	답 입력 : 12311
	
	이름 입력 : 김태리
	답 입력 : 12341 
	
	이름 입력 : 유연석
	답 입력 : 12111 
	
	이름		1 2 3 4 5	점수
	홍길동  	O X X O O	60
	김태리  	O X X X O	40
	유연석  	O X O O O	80
*/