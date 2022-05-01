package tw.com.phctw.demo;

import java.sql.*;

public class JdbcDemo {

	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/WebTest";
	private static final String userId = "root";  //mysql 帳號
	private static final String pwd = "12341234";     //mysql 密碼
	
	public static Connection getConnection() {
		//1.載入JDBC Driver
		try {										
			Class.forName(driver);
			try {
				Connection connection = DriverManager.getConnection(url, userId, pwd);//2.建立連線
				return connection;  
				
			} catch (SQLException e) {
				throw new RuntimeException("建立連線失敗", e);
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("載入JDBC Driver失敗:" +driver);
		}	
	}
	
//	測試是否連線成功
//	public static void main(String[] args) {
//		System.out.println(getConnection());
//	}
}
