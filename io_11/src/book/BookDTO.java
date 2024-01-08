package book;


public class BookDTO {

	private String code;         // 코드
	private String title;     // 제목
	private String author;    // 저자
	private int price;    // 가격
	
	private int qty; 	// 수량
	private int total;   // 총합
	
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	
} // end class

/*
	Package : book
	
	Interface : Book.java
	
	Class     : BookMain.java
	             BookService.java
	             BookDTO.java
	
	             BookInsert.java
	             BookPrint.java
	             BookFileWrite.java
	             BookFileRead.java
	
	             
	필드
	code, title, author, price, qty, total
	
	메뉴
	1. 등록
	2. 출력
	3. 파일 저장
	4. 파일 읽기
	5. 책 제목으로 내림차순
	6. 끝
	
	번호 선택 : 
	
	조건
	1. 
	
	입력 할 때 데이터 중복 허용
	book01	자바		김자바	35000		10
	book02	스프링	이봄		40000		5
	book01	자바		김자바	35000		8
	book01	자바		김자바	35000		2
	
	출력할 때는 같은 데이터는 묶어서 출력
	book01	자바		김자바	35000		20	xxxxx
	book02	스프링	이봄		40000		5	xxx

*/