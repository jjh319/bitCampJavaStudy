package book;

import java.io.IOException;

public class BookMain {

	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		BookService service = new BookService();
		
		while(service.isEnd()) {
			
			service.menu();
			
		} // while

		
	} // main

} // end class
