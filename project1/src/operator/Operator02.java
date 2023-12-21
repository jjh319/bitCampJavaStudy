package operator;

import java.util.Scanner;

public class Operator02 {

	
	public static void main(String[] args) {  // 조건문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println(score >= 80 && score<=100 ? "합격" : "불합격");
		
		
		
	} // main

} // end class
