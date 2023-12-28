package class_;


public class SungjukMain {

	
	public static void main(String[] args) {
		
		Sungjuk sj = new Sungjuk();
		
		sj.setData("장지훈", 100, 90, 90);
		sj.calc();

		System.out.println("-----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.println(sj.getName() + "\t" + sj.getKor() + "\t" + sj.getEng() + "\t" +
						sj.getMath() + "\t" + sj.getTot() + "\t" +
						String.format("%.2f",sj.getAvg()) + "\t" +
						sj.getGrade()
				);
		
		// -------------------------------------------
		System.out.println();
		
		Sungjuk bb = new Sungjuk();
		
		bb.setData("홍길동", 80, 66, 78);
		bb.calc();

		System.out.println("-----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.println(bb.getName() + "\t" + bb.getKor() + "\t" + bb.getEng() + "\t" +
				bb.getMath() + "\t" + bb.getTot() + "\t" +
						String.format("%.2f",bb.getAvg()) + "\t" +
						bb.getGrade()
				);
		
		// -------------------------------------------
		System.out.println();
		
		Sungjuk cc = new Sungjuk();
		
		cc.setData("라이언", 47, 53, 68);
		cc.calc();

		System.out.println("-----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		System.out.println(cc.getName() + "\t" + cc.getKor() + "\t" + cc.getEng() + "\t" +
				cc.getMath() + "\t" + cc.getTot() + "\t" +
						String.format("%.2f",cc.getAvg()) + "\t" +
						cc.getGrade()
				);
		
	} // main

} // end class
