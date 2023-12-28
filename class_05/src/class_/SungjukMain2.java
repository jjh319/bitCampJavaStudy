package class_;


public class SungjukMain2 {

	
	public static void main(String[] args) {
		
		Sungjuk[] ar = new Sungjuk[3];
		ar[0] = new Sungjuk();
		ar[1] = new Sungjuk();
		ar[2] = new Sungjuk();

		ar[0].setData("장지훈", 100, 90, 90);
		ar[1].setData("홍길동", 80, 66, 78);
		ar[2].setData("라이언", 47, 53, 68);
		
		
		for(Sungjuk data : ar) {
			data.calc();
			
			System.out.println("-----------------------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("-----------------------------------------------");
			System.out.println(data.getName() + "\t" + data.getKor() + "\t" + data.getEng() + "\t" +
					data.getMath() + "\t" + data.getTot() + "\t" +
							String.format("%.2f",data.getAvg()) + "\t" +
							data.getGrade()
					);
			System.out.println();
		} // for
		
	} // main

} // end class
