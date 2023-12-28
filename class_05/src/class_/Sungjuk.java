package class_;


public class Sungjuk {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int tot;
	private double avg;
	private String grade;
	
	
	
	public String getName() {
		return this.name;
	} // getName
	
	
	public int getKor() {
		return this.kor;
	} // getKor
	
	public int getEng() {
		return this.eng;
	} // getEng
	
	public int getMath() {
		return this.math;
	} // getMath
	
	public int getTot() {
		return this.tot;
	} // getTot
	
	public double getAvg() {
		return this.avg;
	} // getAvg
	
	public String getGrade() {
		return this.grade;
	} // getGrade
	
	public void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} // setData
	
	public void calc() {
		tot = kor + eng + math; // 총점 계산
		
		avg = (double) tot / 3; // 평균 계산
		
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else if(avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		} // if-else if-else
		
	} // calc
	
} // end class

/*

	[문제] 성적처리
	클래스명 : SungJuk
	필드 : name, kor, eng, math, tot, avg, grade
	메소드 : setData(이름, 국어, 영어, 수학)
	       calc() - 총점, 평균, 학점 계산
		   getName()
		   getKor()
		   getEng()
		   getMath()
	       getTot()
	       getAvg()
	       getGrade()
	
	클래스명 : SungJukMain
	
	[실행결과]
	----------------------------------------------------
	이름		국어		영어		수학		총점		평균		학점
	----------------------------------------------------
	홍길동	     90		     95		    100

*/