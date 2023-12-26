package array;

import java.util.Scanner;

public class Array03 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		for(int i=0; i<ar.length; i++) {
			
			
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i] = sc.nextInt();
			
			
		} // for
		int sum = 0;
		
		for(int a : ar) {
			sum = sum+a;
			
		} // enhanced for
		System.out.println("배열의 총 합 : " + sum );

	} // main

} // end class

/*
	[문제]
	배열 크기 입력 : 3
	
	ar[0] 입력 : 25
	ar[1] 입력 : 12
	ar[2] 입력 : 37
	합 = xxx
	

*/