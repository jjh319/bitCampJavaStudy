package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

	private boolean end = true;
	Scanner sc = new Scanner(System.in);
	ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
	Employee employee;
	
	public void menu() {
		 System.out.println("****************");
	      System.out.println("1. 등록");
	      System.out.println("2. 출력");
	      System.out.println("3. 수정");
	      System.out.println("4. 삭제");
	      System.out.println("5. 검색");
	      System.out.println("6. 정렬");
	      System.out.println("7. 종료");
	      System.out.println("****************");
	      
	      System.out.print("번호 : ");
	      int num = sc.nextInt();
	      
	      if(num == 1) {
	         employee = new EmployeeInsert();
	         employee.exeCute(list);
	         
	      } else if(num == 2) {
	    	  employee = new EmployeePrint();
	    	  employee.exeCute(list);
	      } else if(num == 3) {
	    	  employee = new EmployeeUpdate();
	    	  employee.exeCute(list);
	      } else if(num == 4) {
	    	  employee = new EmployeeDelete();
	    	  employee.exeCute(list);
	      } else if(num == 5) {
	    	  employee = new EmployeeSearch();
	    	  employee.exeCute(list);
	      } else if(num == 6) {
	    	  employee = new EmployeeSort();
	    	  employee.exeCute(list);
	      } else if(num == 7) {
	    	  this.end = false;
	      } // if-else if
	      
	      
	      
	} // menu
	
	
	
	
	
	
	
	public boolean isEnd() {
		return end;
	} // isEnd
	
} // end class
