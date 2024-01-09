package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class BookTitleDesc implements Book {

	@Override
	public void exeCute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
		
		Comparator<BookDTO> com = new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO b1, BookDTO b2) {
                return b2.getTitle().compareTo(b1.getTitle());
            } // compare
        };
        
        list.sort(com);
		
	} // exeCute

	
	
} // end class
