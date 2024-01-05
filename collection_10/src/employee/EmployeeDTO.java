package employee;


public class EmployeeDTO implements Comparable<EmployeeDTO>{

	private int num;	// 사원번호
	private String name;	// 이름
	private String job;		// 직급
	
	private int basic;		// 기본급
	private int extra;		// 수당
	private int total;		// 합계
	private int rate;		// 세금
	private double seyul;	// 세율
	private int salary;		// 월급
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getBasic() {
		return basic;
	}
	
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	public int getExtra() {
		return extra;
	}
	
	public void setExtra(int extra) {
		this.extra = extra;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getRate() {
		return rate;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public double getSeyul() {
		return seyul;
	}
	
	public void setSeyul(double seyul) {
		this.seyul = seyul;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeDTO dto) {
		
		return dto.getSalary() - this.getSalary();
	} // compareTo
	
	
	
	
	
} // end class
