package class2;


public class StringMain {

	
	public static void main(String[] args) {
		
		String a = "apple";
		String b = "apple";
		
		if(a == b) {
			System.out.println("a와 b의 참조값은 같다.");
		} else {
			System.out.println("a와 b의 참조값은 다르다.");
		} // if-else
		
		if(a.equals(b)) {
			System.out.println("a와 b의 문자열은 같다.");
		} else {
			System.out.println("a와 b의 문자열은 다르다.");
		} // if-else
		
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(c == d) {
			System.out.println("c와 d의 참조값은 같다.");
		} else {
			System.out.println("c와 d의 참조값은 다르다.");
		} // if-else
		
		if(c.equals(d)) {
			System.out.println("c와 d의 문자열은 같다.");
		} else {
			System.out.println("c와 d의 문자열은 다르다.");
		} // if-else
		

		String e = "오늘 날짜는 " + 2023 + 12 + 29;
		System.out.println("e = " + e);
		System.out.println("문자열 크기 = " + e.length());
		
		System.out.println("5번째 위치의 문자 = " + e.charAt(5));
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7,11));
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("대문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부"));
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
		
	} // main

} // end class
