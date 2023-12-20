package variable;

public class Variable2 {
	
	int a;
	
	static String str;
	
	public static void main(String[] args) {
		
		int a = 10; // 지역 변수
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 a = " + new Variable2().a);
		
		System.out.println("필드 str = " + str);
		
	} // main

} // end class
