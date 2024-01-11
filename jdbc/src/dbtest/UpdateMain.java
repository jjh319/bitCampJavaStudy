package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {

	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "1234";

	public UpdateMain() {
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
			System.out.println("Connection Success");
		} catch(SQLException e) {
			e.printStackTrace();
		} // try-catch
		
	} // getConnection
	
	public void updateArticle() {
		this.getConnection(); // 접속
		
		try {
			String sql = "UPDATE dbtest SET age=age+1, height=height+1 WHERE name LIKE '%홍%' ";
			
			pstmt = conn.prepareStatement(sql);
			
			int su = pstmt.executeUpdate();  // 실행
			
			System.out.println(su +" 개의 행이 업데이트 되었습니다.");
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
		
		
	} // updateArticle
	

	public static void main(String[] args) {
		UpdateMain updateMain = new UpdateMain();
		updateMain.updateArticle();
		

	} // main

} // end class
