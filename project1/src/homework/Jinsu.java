package homework;


public class Jinsu {

	
	public static void main(String[] args) {
		
		int num = 250;
		
		String numBin =  Integer.toBinaryString(num);
		System.out.println(numBin);
		
		String numOct = Integer.toOctalString(num);
		System.out.println(numOct);
		
		String numHex = Integer.toHexString(num);
		System.out.println(numHex);
		
		
	} // main

} // end class

/*
	[문제] 250을 저장한 후 2진수, 8진수, 16진수로 변환한 값을 출력
	
	[조건]
	2진수, 8진수, 16진수로 변환시켜주는 함수를 이용 - Integer
	
	[실행결과]
	10진수 = 250 (dec)
	2진수 = 1111 1010 (bin)
	8진수= 372 (oct)
	16진수 = fa (hex)
	
 */
