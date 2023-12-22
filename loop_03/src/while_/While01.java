package while_;


public class While01 {

	
	public static void main(String[] args) { // while 문
		
		// 1 2 3 4 5 6 7 8 9 10
		
		//for(int i=1; i<=10; i++)
		
		int i=1;
		
		while(i<=10) {
			
			System.out.print(i + "  ");
			
			i++;
			
		} // while
		System.out.println();
		
		int j=0;
		while(j<10) {
			j++;
			
			System.out.print(j + "  ");
		} // while
		System.out.println();
		
		
		int k = 0;
		while(true) { // 무한루프 , for(;;)
			k++;
			
			System.out.print(k + "  ");
			
			if(k == 10) { break; }
		} // while
		

	} // main

} // end class
