package if_;

import java.util.Scanner;

public class If01 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 입력 : ");
		int a = sc.nextInt();
		
		if(a >= 50) {
			System.out.println(a + "는 50보다 크거나 같다.");
		} else {
			System.out.println(a + "는 50보다 작다.");
		} // if-else
		
		
		if(true) {
			if(false) {
				System.out.println("A");
			} else {
				System.out.println("B");
			} // inner if-else
			
		} // if
		System.out.println("C");
		
		
	} // main

} // end class
