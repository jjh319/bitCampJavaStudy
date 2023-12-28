package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SungJuk {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			
			System.out.print("인원수 : ");
			int cnt = sc.nextInt();  //  인원 수
			
			String[] name = new String[cnt];  // 이름
			
			String[][] subject = new String[cnt][]; // 과목
			int[][] jumsu = new int[cnt][]; // 점수
			int[] sum; // 총점
			double[] avg; // 평균
			sum = new int[cnt];
			avg = new double[cnt];
			
			int num = 1; // 조건 달성시 출력
			for(int i=0; i<name.length; i++) {
				
				System.out.print("이름 입력 : ");
				String nick = sc.next();  // 이름
				System.out.println();
				name[i] = nick;
				
				System.out.print("과목수 입력 : ");
				int subjectCnt = sc.nextInt(); // 과목 수 
				System.out.println();
				
				
				subject[i] = new String[subjectCnt];
				jumsu[i] = new int[subjectCnt];
				
				// 과목 수 만큼 과목 명을 입력받아 넣음	
				for(int k=0; k<subjectCnt; k++) {
					System.out.print("과목명 입력 : ");
					String sub = sc.next();
					System.out.println();
				
					subject[i][k] = sub;
					
				} // inner for
				
			
				for(int j=0; j<subjectCnt; j++) {
					System.out.print(subject[i][j] + " 점수 입력 : ");
					int jum = sc.nextInt(); // 점수
					System.out.println();
					jumsu[i][j] = jum;
				} // inner for
				System.out.println("---------------------------");
				
				
				//총점
				
				for(int j=0; j<subjectCnt; j++) {
					sum[i] += jumsu[i][j]; 
				}  // inner for
				
				// 평균
				
				for(int j=i; j<i+1; j++) {
					avg[i] = (double) sum[i] / subjectCnt; 
				} // for
			
			
				System.out.println(Arrays.deepToString(subject));
				System.out.println(Arrays.deepToString(jumsu));
				System.out.println(Arrays.toString(name));
				
				
				if(cnt == num) {
					
					
					for(int j=0; j<cnt; j++) {
						System.out.print("이름\t");
						for(int k=0; k<subject[j].length; k++) {
							System.out.print(subject[j][k] +"\t");
						} // inner for
						System.out.println("총점\t평균");
						
						
						System.out.print(name[j] + "\t");
						for(int k=0; k<jumsu[j].length; k++) {
							System.out.print(jumsu[j][k] + "\t");
						} // inner for
						
						System.out.println(sum[j] + "\t" + String.format("%.2f", avg[j]) );
						System.out.println();
						
						
					} // for
				
				} // if
//					
				num++;
				
				
				
			} // for 
			
			
				
	

	} // main

} // end class

/*

	인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
	평균은 소수이하 2째자리까지 출력
	
	[실행결과]
	인원수 : 2 (cnt)
	
	이름입력 : 홍길동 (name)
	과목수 입력 : 2   (subjectCnt)
	과목명 입력 : 국어 (subject)
	과목명 입력 : 영어
	국어 점수 입력 : 95 (jumsu)
	영어 점수 입력 : 100
	---------------------
	이름입력 : 이기자
	과목수 입력 : 3
	과목명 입력 : 국어
	과목명 입력 : 영어
	과목명 입력 : 과학
	국어 점수 입력 : 95
	영어 점수 입력 : 100
	과학 점수 입력 : 90
	---------------------
	
	이름     국어	  영어   총점     평균
	홍길동    95	  100   xxx	  xx.xx
	
	이름		국어  영어   과학    총점      평균
	이기자	95   100   90	 xxx      xx.xx

*/
