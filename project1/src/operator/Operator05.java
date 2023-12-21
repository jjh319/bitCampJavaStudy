package operator;


public class Operator05 {

	
	public static void main(String[] args) {
		
		boolean a = 25 > 36;
		System.out.println("a = " + a);  // false
		System.out.println("!a = " + !a);  // true
		System.out.println();
		
		String b = "apple";
		String c = new String("apple");
		
		boolean result = b.equals(c); // 문자열 비교
		System.out.println(result);
		System.out.println("b == c : " + (b.equals(c) ? "같다" : "다르다") ); 
		System.out.println();
		
		result = b.getClass().getName() == c.getClass().getName();
		System.out.println(result);
		System.out.println();
		
		result = b == c; // 주소 비교
		System.out.println(result);
		System.out.println("b == c : " + (b == c ? "같다" : "다르다") );
		
	} // main

} // end class
