package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInsert implements Book {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void exeCute(ArrayList<BookDTO> list) {
		BookDTO dto = new BookDTO();
		
		System.out.print("코드 입력 : ");
		String code = sc.next();
		
		System.out.print("제목 입력 : ");
		String title = sc.next();
		
		System.out.print("저자 입력 : ");
		String author = sc.next();
		
		System.out.println("가격 입력 : ");
		int price = sc.nextInt();
		
		System.out.print("수량 입력 : ");
		int qty = sc.nextInt();
		
		dto.setCode(code);
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setPrice(price);
		dto.setQty(qty);
		
		
		list.add(dto);
		
	} // exeCute

	
} // end class
