package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee{

	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeDTO dto = new EmployeeDTO();
		
		double seyul = 0;
		int rate;
		int salary;
		
		System.out.print("사원 번호 : ");
		int num = sc.nextInt();
		
		for(EmployeeDTO employeeDTO : list) {
			if(employeeDTO.getNum() == num) {
				System.out.println("이미 있는 사원 번호 입니다.");
				return;
			} // if
		} // enhanced for
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("직급 : ");
		String job = sc.next();
		
		System.out.println("기본급 : ");
		int basic = sc.nextInt();
		
		System.out.print("수당 : ");
		int extra = sc.nextInt();
		
		int total = basic + extra;
		
		if(total > 4000000) {
			seyul = 0.03;
		} else if(total <= 4000000) {
			seyul = 0.02;
		} else if(total <= 2000000) {
			seyul = 0.01;
		} // if-else if-else
		
		rate = (int) (total * seyul);
		salary = total - rate;
		
		dto.setNum(num);
		dto.setName(name);
		dto.setJob(job);
		dto.setBasic(basic);
		dto.setExtra(extra);
		dto.setTotal(total);
		dto.setRate(rate);
		dto.setSeyul(seyul);
		dto.setSalary(salary);
		
		list.add(dto);
		
	} // exeCute

	
	
} // end class
