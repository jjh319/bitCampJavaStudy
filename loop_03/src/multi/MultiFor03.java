package multi;


public class MultiFor03 {

	
	public static void main(String[] args) {
		
		int dan;
		for(int i=1; i<=9; i++) {
			
			for(dan =2; dan <=9; dan++) {
				System.out.print(dan + " x " + i + " = " + (dan*i) + "\t");
				
			} // inner for
			System.out.println();
		} // for

	} // main

} // end class
