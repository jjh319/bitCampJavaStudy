package class_;


public class SungjukMain {

	
	public static void main(String[] args) {
		
		Sungjuk sj = new Sungjuk();
		
		sj.setData("장지훈", 90, 60, 70);
		sj.calc();

		System.out.println("-----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.println(sj.getName() + "\t" + sj.getKor() + "\t" + sj.getEng() + "\t" +
						sj.getMath() + "\t" + sj.getTot() + "\t" +
						String.format("%.2f",sj.getAvg()) + "\t" +
						sj.getGrade()
				);
		
	} // main

} // end class
