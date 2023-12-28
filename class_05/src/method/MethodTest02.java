package method;


public class MethodTest02 {
	
	
	public static void main(String[] args) {
		MethodTest02 m = new MethodTest02();
		
		System.out.println("합 = " + m.sum(25,36) );
		System.out.println("차 = " + m.sub(25,36) );
		System.out.println("곱 = " + m.mul(25,36) );
		System.out.println("몫 = " + m.div(25,36) );
		
		
	} // main

	
	public int sum(int a, int b) { // 매개 변수, 인수 // 합
		
		return a + b;
	} // sum
	
	public int sub(int a, int b) { // 차
			
		return a - b;
	} // sub
	
	public int mul(int a, int b) { // 곱
		
		return a * b;
	} // mul
	
	public int div(int a, int b) { // 몫
		
		return a / b;
	} // div
	
	
} // end class
