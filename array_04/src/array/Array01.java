package array;


public class Array01 {

	
	public static void main(String[] args) {
		
		int[] ar;
		ar = new int[5];
		
		ar[0] = 25;
		ar[1] = 43;
		ar[2] = 30;
		ar[3] = 27;
		ar[4] = 52;
		
		for(int i= 0; i<ar.length; i++) {
			System.out.println("배열명 ar = " + ar[i]);
		
		} // for
		System.out.println("배열 크기 = " + ar.length);
		System.out.println();
		
		System.out.println("꺼꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("배열명 ar = " + ar[i]);
		} // for 
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i] % 2 == 1) {
				System.out.println("홀수 데이터 ar = " + ar[i]);
			} // if
			
		} // for
		System.out.println();
		
		System.out.println("확장 for문");
		for(int list : ar) {
			System.out.println(list);
		} // enhanced for
		
		
	} // main

} // end class
