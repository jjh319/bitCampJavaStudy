package array;


public class Array04 {

	
	public static void main(String[] args) { // 최대값,최소값 구하기
		
		int[] ar = new int[10];
		int max = 0;  // 최대값
		int min = 0;  // 최소값
		
		for(int i=0; i<ar.length; i++) {
			
			ar[i] = (int) (Math.random() * 100 + 1);
			
	
		} // for
		
		max =  min = ar[0];
		
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			} // if
			
			if(ar[i] < min) {
				min = ar[i];
			} // if
			
		} // fir
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
	} // main

} // end class

/*

	[문제]
	1 ~ 100 까지의 난수를 발생하여 배열에 저장 후 데이터를 출력하고
	최대값, 최소값을 구하시오.
	
	최대값 = xx
	최소값 = xx
	
*/