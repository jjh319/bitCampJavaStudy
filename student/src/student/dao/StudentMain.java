package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentMain {

	Scanner sc = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "1234";
	

	public StudentMain() {
		// Driver Loading
		try {
			Class.forName(driver);
			System.out.println("Driver Loading");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} // try-catch
		
	} // Constructor
	
	public void getConnection() {
		
		try {
			conn = DriverManager.getConnection(url,userName,password);
			System.out.println();
		} catch(SQLException e) {
			e.printStackTrace();
		} // try-catch
		
	} // getConnection
	
	
	public void menu() {
		
		while(true) {
			
			this.getConnection(); // 접속
			
			System.out.println("*******************");
			System.out.println("1. 입력");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			System.out.println("*******************");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				insertArticle();
			} else if(num == 2) {
				selectArticle();
			} else if(num == 3) {
				deleteArticle();
			} else if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} // if-else if
			
		} // while
		
	} // menu
	
	// 입력
	public void insertArticle() {
		
		while(true) {
		
			System.out.println("*******************");
			System.out.println("1. 학생");
			System.out.println("2. 교수");
			System.out.println("3. 관리자");
			System.out.println("4. 이전메뉴");
			System.out.println("*******************");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			
			String sql;
			
			if(num == 1) {
				System.out.print("이름입력: ");
				String name = sc.next();
				
				System.out.print("학번입력: ");
				int stNum = sc.nextInt();
				
				try {
					sql = "INSERT INTO school(name,value,code) VALUES (? , ?, 1)";
					
					pstmt = conn.prepareStatement(sql);
					
					// ?에 데이터 입력
					pstmt.setString(1, name);
					pstmt.setInt(2, stNum);
					
					int su = pstmt.executeUpdate();  // 실행
					
					System.out.println(su +" 개의 행이 만들어졌습니다.");
					
				} catch(SQLException e) {
					e.printStackTrace();
				} // try-catch
				
			} else if(num == 2) {
				System.out.print("이름입력: ");
				String name = sc.next();
				
				System.out.print("과목입력: ");
				String subject = sc.next();
				
				try {
					sql = "INSERT INTO school(name,value,code) VALUES (? , ?, 2)";
					
					pstmt = conn.prepareStatement(sql);
					
					// ?에 데이터 입력
					pstmt.setString(1, name);
					pstmt.setString(2, subject);
					
					int su = pstmt.executeUpdate();  // 실행
					
					System.out.println(su +" 개의 행이 만들어졌습니다.");
					
				} catch(SQLException e) {
					e.printStackTrace();
				} // try-catch
				
			} else if(num == 3) {
				System.out.print("이름입력: ");
				String name = sc.next();
				
				System.out.print("부서입력: ");
				String depart = sc.next();
				
				try {
					sql = "INSERT INTO school(name,value,code) VALUES (? , ?, 3)";
					
					pstmt = conn.prepareStatement(sql);
					
					// ?에 데이터 입력
					pstmt.setString(1, name);
					pstmt.setString(2, depart);
					
					int su = pstmt.executeUpdate();  // 실행
					
					System.out.println(su +" 개의 행이 만들어졌습니다.");
					
				} catch(SQLException e) {
					e.printStackTrace();
				} // try-catch
				
			} else if(num == 4) {
				break;
			} // if-else if
			
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // try-catch
		
		} // while
		
	} // insertArticle
	
	// 검색
	public void selectArticle() {
		
		while(true) {
			
			System.out.println("*******************");
			System.out.println("1. 이름 검색 (1개 글자가 포함된 이름은 모두 검색)");
			System.out.println("2. 전체 검색");
			System.out.println("3. 이전메뉴");
			System.out.println("*******************");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			
			String sql;
			
			if(num == 1) {
				System.out.println("검색할 이름 입력 : ");
				String name = sc.next();
				
				try {
					sql = "SELECT name, value FROM school WHERE name LIKE ?";
					
					pstmt = conn.prepareStatement(sql);  //  생성
					
					// ?에 데이터 입력
					pstmt.setString(1, "%" + name + "%");
					rs = pstmt.executeQuery();   //  실행
					
					while(rs.next()) {
						System.out.println(rs.getString("name") + "\t" + 
										   rs.getInt("value") + "\t" 
								);
					} // while
					
				} catch(SQLException e) {
					e.printStackTrace();
				} // try-catch
				
			} else if(num == 2) {
				
				try {
					sql = "SELECT * FROM school";
					
					pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery(); // 실행
					
					while(rs.next()) {
						System.out.println(rs.getString("name") + "\t" + 
										   rs.getInt("value") + "\t" +
										   rs.getString("code")
								);
					} // while
					
				} catch(SQLException e) {
					e.printStackTrace();
				} // try-catch
				
			} else if(num == 3) {
				break;
			} // if-else if
			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // try-catch
			
		} // while
		
	} // selectArticle
	
	// 삭제
	public void deleteArticle() {
		
		while(true) {

			String sql;
			
			try {
				System.out.println("(정확하게 3개의 글자가 모두 입력된 상태)");
				System.out.print("삭제를 원하는 이름 입력 : ");
				String name = sc.next();
				
				sql = "DELETE FROM school WHERE name = ?";
				
				pstmt = conn.prepareStatement(sql);
				
				// ?에 데이터 입력
				pstmt.setString(1, name);
				
				int su = pstmt.executeUpdate();  // 실행
				
				System.out.println(su +" 개의 행이 삭제되었습니다.");
				
			} catch(SQLException e) {
				e.printStackTrace();
			} // try-catch
			
			break;
		} // while
		
	} // deleteArticle
	
	public static void main(String[] args) {
		StudentMain studentMain = new StudentMain();
		studentMain.menu();

	} // main

} // end class
