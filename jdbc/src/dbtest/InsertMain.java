package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {

	private Connection conn;
	private PreparedStatement pstmt;  // 가이드
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "1234";
	
	public InsertMain() {
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
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Success");
		} catch(SQLException e) {
			e.printStackTrace();
		} // try-catch
		
	} // getConnection
	
	public void insertArticle() {
		this.getConnection(); // 접속
		
		//데이터
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		
		try {
			String sql = "insert into dbtest(name, age, height, logtime) VALUES(?, ?, ?, sysdate) ";
			
			pstmt = conn.prepareStatement(sql);
			
			// ?에 데이터 입력
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			int su = pstmt.executeUpdate();  // 실행
			
			System.out.println(su +" 개의 행이 만들어졌습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // try-catch
			
		} // finally
		
	} // insertArticle
	
	
	public static void main(String[] args)  {
		InsertMain insertMain = new InsertMain();
		insertMain.insertArticle();
		
	} // main

} // end class
