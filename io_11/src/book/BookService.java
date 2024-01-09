package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookService {

	Scanner sc = new Scanner(System.in);
	ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();
	BookDTO dto = new BookDTO();
	Book book;
	private boolean end = true;  // 종료
	
	public void menu() throws ClassNotFoundException, IOException {
		
		System.out.println("1. 등록");
		System.out.println("2. 출력");
		System.out.println("3. 파일 저장");
		System.out.println("4. 파일 읽기");
		System.out.println("5. 책 제목으로 내림차순");
		System.out.println("6. 종료");
		System.out.println();
		
		System.out.print("번호 선택 : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			book = new BookInsert();
			book.exeCute(bookList);
		} else if(num == 2) {
			book = new BookPrint();
			book.exeCute(bookList);
		} else if(num == 3) {
			book = new BookFileWrite();
			book.exeCute(bookList);
		} else if(num == 4) {
			book = new BookFileRead();
			book.exeCute(bookList);
		} else if(num == 5) {
			book = new BookTitleDesc();
			book.exeCute(bookList);
		} else if(num == 6) {
			this.end = false;
		} // if-else if
		
		
	} // menu
	
	
	public boolean isEnd() {
		return end;
	} // isEnd
	
} // end class
