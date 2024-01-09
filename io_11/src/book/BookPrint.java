package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BookPrint implements Book{

	@Override
	public void exeCute(ArrayList<BookDTO> list) {
		
		System.out.println("코드\t\t제목\t\t저자\t\t가격\t\t수량\t\t합계");
		
		Map<BookDTO, Integer> bookMap = new HashMap<>();

        for (BookDTO book : list) {
            if (bookMap.containsKey(book)) {
                bookMap.put(book, bookMap.get(book) + book.getQty());
            } else {
                bookMap.put(book, book.getQty());
            } // if-else
        } // enhanced for

        for (Map.Entry<BookDTO, Integer> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey().getCode() + "\t\t" + entry.getKey().getTitle() + "\t\t" 
            + entry.getKey().getAuthor() + "\t\t" + entry.getKey().getPrice() + "\t\t" 
            + entry.getValue() + "\t\t" + (entry.getKey().getPrice() * entry.getValue()));
        } // enhanced for
		
		
	} // exeCute

	
} // end class
