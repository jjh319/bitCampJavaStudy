package nested;


public class AbstractMain {

	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() { // 익명구현객체
			
			@Override
			public void setName(String name) {
				this.name = name;
				
			} // setName
		};
		
	} // main

} // end class
