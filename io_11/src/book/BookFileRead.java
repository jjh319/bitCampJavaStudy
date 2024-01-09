package book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BookFileRead implements Book{

	@Override
	public void exeCute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
		
		ArrayList<BookDTO> readList = (ArrayList<BookDTO>) ois.readObject();
		
		ois.close();
		
		for (BookDTO book : readList) {
			System.out.println(book.toString());
		} // for
		
		
	} // exeCute

	
	
} // end class
