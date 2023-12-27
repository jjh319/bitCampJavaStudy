package homework;


public class CharCount {

	
	public static void main(String[] args) {
		
		char[] ar = new char[50];
		
		
		
		for(int k=0; k<5; k++) {
			
			for(int i=0; i<10; i++) {
				// k*10 : 행 , i : 행의 시작 열
				ar[k * 10 + i] = (char) (Math.random() *26 + 'A');
				System.out.print(ar[k * 10 + i] + "  ");
				
			} // for
		System.out.println();
		} // for
		
			
		// 각 문자의 개수 세기
        int[] count = new int[26]; // 알파벳 26개 A ~ Z까지의 인덱스 0 ~ 25 , B의 인덱스1

        for (char a : ar) {
            count[a - 'A']++; // ex) a의 값에 B가 들어오면 'B' - 'A' = 66 - 65 = 1이므로
        }                     // B가 1 증가하도록 설계

        // 개수 출력
        // i가 0이면, ch는 'A'가 되고, count[0]은 'A'의 발생 횟수를 나타냄.
        for (int i = 0; i < count.length; i++) { 
            char ch = (char) ('A' + i);
            System.out.println(ch + "의 갯수 : " + count[i]);
        } // for
		

	} // main

} // end class

/*

	[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
	- 1줄에 10개씩 출력
	- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?
	
	[실행결과]
	D F A G H I J K L T
	O P W E R F V A S B
	P Y R O L E E Z L I
	F E U Z T U P P P A
	S P G B F F O W J C
	
	A : 2
	B : 3
	...
	X : 0
	Y : 1
	Z : 0

*/