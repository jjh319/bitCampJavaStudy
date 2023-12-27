package multi;


public class MultiArray02 {

	
	public static void main(String[] args) {
		
		int num = 1;
		
		int[][] ar = new int[10][10];
		
		// 입력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				ar[i][j] = num;
				num++;
			} // inner for
			
		} // for
		
		// 출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));
			} // inner for
			System.out.println();
		} // for

	} // main

} // end class
