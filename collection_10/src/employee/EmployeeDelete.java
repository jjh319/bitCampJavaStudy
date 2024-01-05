package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDelete implements Employee{

	Iterator<EmployeeDTO> iter;
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		
		System.out.print("삭제할 사원번호 : ");
		int num = sc.nextInt();
		iter = list.iterator();
		int cnt = 0;
		
		while(iter.hasNext()) {
			EmployeeDTO dto = iter.next();
			
			if(dto.getNum() == num) {
				cnt++;
				iter.remove();
				System.out.println("삭제 완료.");
			} // if
			
		} // while
		
		if(cnt == 0) {
			System.out.println("사원번호가 존재하지 않습니다.");
		} // if
		
		
	} // exeCute

	
	
} // end class
