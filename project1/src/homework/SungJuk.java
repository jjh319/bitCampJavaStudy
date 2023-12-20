package homework;


public class SungJuk {

	
	public static void main(String[] args) {
		
		
		String name = "L";
		
		int kor = 85;
		int eng = 90;
		int math = 100;
		
		int max = kor + eng + math;
		
		double avg = (double) max / 3;
		
		System.out.printf("*** %s 성적표  ***", name);
		System.out.println();
		
		System.out.printf("국어: %d , 영어: %d , 수학: %d\n", kor, eng, math);
		System.out.println("총점 : " + max);
		System.out.printf("평균 : %.3f", avg);
		
		
	} // main

} // end class


/*
	[문제] 성적 계산
	이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오
	
	[조건]
	총점 = 국어 + 영어 + 수학
	평균 = 총점 / 과목수
	평균의 소수이하 3째자리까지 출력
	
	[실행결과]
			*** L 성적표 ***
	국어		영어		수학		총점		평균
	85		90		100		xxx		xx.xxx

 */
