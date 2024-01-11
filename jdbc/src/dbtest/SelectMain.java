package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userName = "c##java";
	private String password = "1234";

	public SelectMain() {
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
	
	public void selectArticle() {
		this.getConnection(); // 접속
		
		String sql = "SELECT * FROM dbtest";
		
		try {
			pstmt = conn.prepareStatement(sql);  //  생성
			rs = pstmt.executeQuery();   //  실행
			
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t" + 
								   rs.getInt("age") + "\t" +
								   rs.getDouble("height") + "\t" +
								   rs.getString("logtime")
						);
			} // while
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} // try-catch
			
		} // finally
		
	} // selectArticle
	
	
	public static void main(String[] args) {
		SelectMain selectMain = new SelectMain();
		selectMain.selectArticle();

	} // main

} // end class
