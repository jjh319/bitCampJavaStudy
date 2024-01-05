package employee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeSearch implements Employee{

	Scanner sc = new Scanner(System.in);
	Iterator<EmployeeDTO> iter;
	DecimalFormat df = new DecimalFormat();
	
	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		
		System.out.print("검색 이름 : ");
		String name = sc.next();
		iter = list.iterator();
		int cnt = 0;
		
		while(iter.hasNext()) {
			EmployeeDTO dto = iter.next();
			
			if(dto.getName().equals(name)) {
				cnt++;
				System.out.println(dto.getName() + "\t" + dto.getJob() + "\t" + 
								   df.format(dto.getBasic()) + "\t   " + df.format(dto.getExtra()) + "\t" + 
								   df.format(dto.getTotal()) + "\t   " + dto.getSeyul() + "\t" + 
								   df.format(dto.getRate()) + "\t  " + df.format(dto.getSalary())
						);
			} // if
			
		} // while
		
		if(cnt == 0) {
			System.out.println("회원이 존재하지 않습니다.");
		} // if
		
	} // exeCute

	
	
} // end class
