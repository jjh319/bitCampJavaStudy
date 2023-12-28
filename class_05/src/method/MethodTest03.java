package method;


public class MethodTest03 {

	
	public static void main(String[] args) {
		MethodTest03 m = new MethodTest03();
		
		System.out.println("합 = " + m.sum(10, 20) );
		System.out.println("합 = " + m.sum(10, 20, 30) );
		System.out.println("합 = " + m.sum(10, 20, 30, 40) );

	} // main

	public int sum(int...ar) {
		
		int hab = 0;
		for(int i=0; i<ar.length; i++) {
			hab += ar[i];
		} // for
		
		return hab;
		
	} // sum
	
	
	// Overload
	/*
	public int sum(int a, int b) {
		
		return a+b;
	} // sum
	
	public int sum(int a, int b , int c) {
		
		return a+b+c;
	} // sum
	
	public int sum(int a, int b , int c, int d) {
		
		return a+b+c+d;
	} // sum
	*/
} // end class
