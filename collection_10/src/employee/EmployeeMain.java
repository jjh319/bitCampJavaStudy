package employee;

import java.util.Scanner;

public class EmployeeMain {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		
		while(service.isEnd()) {
			
			service.menu();
			
		} // while
		System.out.println("프로그램을 종료합니다.");

	} // main

} // end class
