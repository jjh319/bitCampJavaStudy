package book;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookFileWrite implements Book{

	@Override
	public void exeCute(ArrayList<BookDTO> list) throws IOException {
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
		
		oos.writeObject(list);
		
		oos.flush();
		oos.close();
		
	} // exeCute

	
	
} // end class
