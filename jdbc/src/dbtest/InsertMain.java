package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain {

	private Connection conn;
	private PreparedStatement pstmt;  // 가이드
	
	public InsertMain() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} // try-catch
		
	} // Constructor
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##java","1234");
			System.out.println("Connection Success");
		} catch(SQLException e) {
			e.printStackTrace();
		} // try-catch
		
	} // getConnection
	
	public void insertArticle() {
		this.getConnection(); // 접속
		
		
		try {
			pstmt = conn.prepareStatement("insert into dbtest(name, age, height, logtime) VALUES('라이언', 30, 157.3, sysdate) ");
			int su = pstmt.executeUpdate();  // 실행
			
			System.out.println(su +" 개의 행이 만들어졌습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
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
