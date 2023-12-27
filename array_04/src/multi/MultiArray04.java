package multi;


public class MultiArray04 {

	
	public static void main(String[] args) {
		
		String[] name = {"홍길동","프로도","라이언"};
		
		int[][] jumsu = { {90,95,100} , {100, 89, 75} , {75, 80, 48}  };
		
		int[] sum = new int[3]; // 총점
		int[] avg = new int[3]; // 평균
		String[] grade = new String[3];
		
		
		// 총점구하기
		for(int i=0; i<name.length; i++) {  
			for(int j=0; j<jumsu.length; j++) {
				sum[i] += jumsu[i][j]; 
			} // inner for
		} // for

		// 평균구하기
		for(int i=0; i<sum.length; i++) {
			avg[i] = sum[i] / 3;
		} // for
		
		//학점구하기
		for(int i=0; i<grade.length; i++) {
			if(avg[i] >= 90) {
				grade[i] = "A";
			} else if(avg[i] >= 80) {
				grade[i] = "B";
			} else if(avg[i] >= 70) {
				grade[i] = "C";
			} else if(avg[i] >= 60) {
				grade[i] = "D";
			} else if(avg[i] < 60) {
				grade[i] = "F";
			} // if-else if
		} // for
		
		//출력
		System.out.println("------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------");
		for(int i=0; i<1; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(
						name[j] + "\t" + jumsu[j][i] + "\t" + jumsu[j][i+1] + "\t" + 
								jumsu[j][i+2] + "\t" + sum[j] + "\t" +
								avg[j] + "\t" + grade[j]
						);
			} // inner for
		} // for
		
		
	} // main

} // end class

/*
	[문제] 성적 계산
	총점 = 국어 + 영어 + 수학
	평균 = 총점 / 과목수
	학점은 평균이 90 이상이면 A
	              80 이상이면 B
	              70 이상이면 C
	              60 이상이면 D
	              그 외 F

----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	     90		     95		    100
프로도	     100		 89		     75
라이언	     75		     80		     48
----------------------------------------------------
*/