package class_;

import java.text.DecimalFormat;

public class SalaryMain {

	
	public static void main(String[] args) {
		
		SalaryDTO[] ar = new SalaryDTO[3];
		
		DecimalFormat df = new DecimalFormat();
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = new SalaryDTO();
		} // for
		
		ar[0].setData("홍길동", "이사", 4800000, 300000);
		ar[1].setData("송중기", "사원", 2000000, 100000);
		ar[2].setData("아이유", "주임", 2900000, 150000);
		
		System.out.println("이름\t직급\t 기본급\t     수당\t  합계\t     세율\t 세금\t     월급");
		System.out.println("--------------------------------------------------------------------------");
		for(SalaryDTO data : ar) {
			data.calc();
			
			System.out.println(data.getName() + "\t" + data.getJob() + "\t" +
							   df.format(data.getBasic()) + "   " + df.format(data.getExtra()) + "\t" + 
							   df.format(data.getTotal()) + "    "+ data.getSeyul() + "\t" + 
							   df.format(data.getRate()) + "\t   " + 
							   df.format(data.getSalary())
					);
			
		} // enhanced for
		
	} // main

} // end class
