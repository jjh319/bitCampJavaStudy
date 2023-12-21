package operator;


public class Operator03 {

	
	public static void main(String[] args) {  // 선행, 후행
		
		int a = 5;
		
		a += 3;
		a *= 2; 
		System.out.println("a = " + a);
		
		int v = ++a;
		System.out.println("v = " + v);
		
		v = a++;
		System.out.println("v = " + v);
		System.out.println("a = " + a);
		
		int c = ++a - v--;
		System.out.printf("c = %d, a = %d, v = %d\n" , c , a , v);
		
		System.out.println("a = " + a++); // 19
		System.out.println("a = " + a); // 20
		
		
	} // main

} // end class
