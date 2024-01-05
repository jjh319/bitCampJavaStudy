package employee;

import java.util.ArrayList;
import java.util.Collections;


public class EmployeeSort implements Employee{

	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		
		Collections.sort(list);
		
	} // exeCute

	
	
} // end class
