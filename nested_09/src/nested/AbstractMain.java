package nested;


public class AbstractMain {

	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() { // 익명구현객체
			
			@Override
			public void setName(String name) {
				this.name = name;
				
			} // setName
		};
		
		
		//interface 생성
		InterA in = new InterA() {
			
			@Override
			public void bb() {
				
				
			} // bb
			
			@Override
			public void aa() {
				
				
			} // aa
		};
		
		// 추상메소드가 없는 추상클래스 생성
		AbstractExam exam = new AbstractExam() {
			// 원하는 메소드 Override
			
		};
		
		
	} // main

} // end class
