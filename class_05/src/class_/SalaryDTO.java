package class_;


public class SalaryDTO {

	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private int rate;
	private double seyul;
	private int salary;
	
	public String getName() {
		return this.name;
	} // getName
	
	public String getJob() {
		return this.job;
	} // getJob
	
	public int getBasic() {
		return this.basic;
	} // getBasic
	
	public int getExtra() {
		return this.extra;
	} // getExtra
	
	public int getTotal() {
		return this.total;
	} // getTotal
	
	public double getSeyul() {
		return this.seyul;
	} // getSeyul
	
	public int getRate() {
		return this.rate;
	} // getRate
	
	public int getSalary() {
		return this.salary;
	} // getSalary
	
	
	public void setData(String name, String job, int basic, int extra) {
		this.name = name;
		this.job = job;
		this.basic = basic;
		this.extra = extra;
	} // setData
	
	public void calc() {
		total = basic + extra;
		
		if(total >= 5000000) {
			seyul = 0.03;
		} else if(total >= 3000000) {
			seyul = 0.02;
		} else {
			seyul = 0.01;
		} // if-else if-else
		
		rate = (int) (total * seyul);
		salary = total - rate;
	} // calc
	
} // end class

/*

	[문제] 월급 계산
	합계 = 기본급 + 수당
	세금 = 합계 * 세율
	월급 = 합계 - 세금
	
	[조건]
	1. 조건 연산자 이용
	합계가 5,000,000원 이상이면 3% (0.03)
	     3,000,000원 이상이면 2% (0.02)
	     아니면 1% (0.01)
	2. 숫자는 3자리마다 , 표시
	3. 소수이하는 표시하지 않는다. (정수형)
	
	클래스명 : SalaryDTO
	필드 : name, job, basic, extra, total, rate, salary
	메소드 : setData(이름, 직급, 기본급, 수당)
	       calc() - 합계, 세율, 월급 계산
		   getName()
		   getJob()
		   getBasic()
		   getExtra()
	       getTotal()
	       getRate()
	       getSalary()
	
	클래스명 : SalaryMain
	
	[실행결과]
	이름		직급		기본급			수당			합계		세금		월급
	홍길동		이사		4,800,000	300,000	
	송중기		사원		2,000,000	100,000
	아이유		주임		2,900,000	150,000	

*/