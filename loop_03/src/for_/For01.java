package for_;


public class For01 {

	
	public static void main(String[] args) {
		

		int i = 0;
		for( ; i<10; i++) {
			System.out.println("Hello World : " + i);
		} // for
 
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		for(; i>0; i--) {
			System.out.print(" i = " + i);
		} // for
		System.out.println();
		
		for(char c='A'; c<='Z'; c++) {
			System.out.print(c + " ");
		} // for
		System.out.println();
		
	} // main

} // end class
