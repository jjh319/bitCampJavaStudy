package book;

import java.io.IOException;
import java.util.ArrayList;


public interface Book {

	public abstract void exeCute(ArrayList<BookDTO> list) throws IOException, ClassNotFoundException; 
	
} // end interface
