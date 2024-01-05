package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeUpdate implements Employee{

	
	
	
	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		double seyul = 0;
		int rate;
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("사원 번호 : ");
		int num = sc.nextInt();
		
		int cnt = 0;
		
		for(EmployeeDTO dto : list) {
			if(dto.getNum() == num) {
				cnt++;
				System.out.print("수정할 직급 : ");
				String sJob = sc.next();
				
				System.out.println("기본급 : ");
				int sBasic = sc.nextInt();
				
				System.out.print("수당 : ");
				int sExtra = sc.nextInt();
				
				int total = sBasic + sExtra;
				
				if(total > 4000000) {
					seyul = 0.03;
				} else if(total <= 4000000) {
					seyul = 0.02;
				} else if(total <= 2000000) {
					seyul = 0.01;
				} // if-else if-else
				
				rate = (int) (total * seyul);
				salary = total - rate;
				
				dto.setJob(sJob);
				dto.setBasic(sBasic);
				dto.setExtra(sExtra);
				dto.setTotal(total);
				dto.setRate(rate);
				dto.setSeyul(seyul);
				dto.setSalary(salary);
				
				break;
			} // if
		
		} // enhanced for
		
		if(cnt == 0) {
			System.out.println("사원번호가 존재하지 않습니다.");
		} // if
		
		
	} // exeCute

	
	
} // end class
