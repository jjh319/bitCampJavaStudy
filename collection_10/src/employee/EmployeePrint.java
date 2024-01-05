package employee;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;

public class EmployeePrint implements Employee{

	DecimalFormat df = new DecimalFormat();
	
	@Override
	public void exeCute(ArrayList<EmployeeDTO> list) {
		
		System.out.println("사원번호    이름    직급    기본급          수당         합계          세율       세금       월급");
		
		for(EmployeeDTO dto : list) {
			System.out.println(dto.getNum() + "           " + dto.getName() + "    " + 
							   dto.getJob() + "    " + df.format(dto.getBasic()) + "      " + 
							   df.format(dto.getExtra()) + "      " + df.format(dto.getTotal()) + "      " + 
							   dto.getSeyul() + "      " + df.format(dto.getRate()) + "      " + 
							   df.format(dto.getSalary())
					);
		} // for
		
	} // exeCute

	
	
} // end class
