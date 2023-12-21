package variable;

import java.util.Scanner;

public class Input2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("실수 입력 : ");
		double b = sc.nextDouble();
		
		System.out.println(a + " + " + b + " = " + (a+b) );
		
		
	} // main

} // end class
