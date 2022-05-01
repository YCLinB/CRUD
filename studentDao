package tw.com.phctw.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tw.com.phctw.bean.Student;
import tw.com.phctw.demo.JdbcDemo;


public class StudentDao {

	private static final String SELECT_ALL_STUDENT = "SELECT id, name, age, sex, email, password FROM student";
	public List <Student> selectStudent() {
        List <Student> list = new ArrayList <Student> ();
        try(
       		Connection connection = JdbcDemo.getConnection();//1,2 取得連線
			PreparedStatement pstmt = connection.prepareStatement(SELECT_ALL_STUDENT); //3.準備指令
			ResultSet rs = pstmt.executeQuery();//4.執行指令
        ) {
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getString("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setSex(rs.getString("sex"));
                student.setEmail(rs.getString("email"));
                student.setPassword(rs.getString("password"));
                
//              Student student = new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6));
                
                list.add(student);
            }
        } catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查詢失敗："+e);
		}
		return list; 
    }
	
	
	
	
	
	private static final String INSERT_STUDENT = "INSERT INTO student"
			+ "(id, name, age, sex, email, password)"
			+ "VALUES(?,?,?,?,?,?)";
	public boolean insertStudent(Student student) {	
		int n = 0;
		try (
				Connection connection = JdbcDemo.getConnection();//1,2. 取得連線
				PreparedStatement pstmt = connection.prepareStatement(INSERT_STUDENT); //3.準備指令
		) {
			//3.1傳入?的值
				pstmt.setString(1, student.getId());
				pstmt.setString(2, student.getName());
				pstmt.setInt(3, student.getAge());
				pstmt.setString(4, student.getSex());
				pstmt.setString(5, student.getEmail());
				pstmt.setString(6, student.getPassword());
				
				int rows = pstmt.executeUpdate();//4.執行指令
				System.out.println("插入語句執行結果-----" + rows);
				if (rows>0) {
					System.out.println("新增資料成功");
				}
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("新增失敗："+e);
		}
		return n > 0 ? true : false;	
	}
	
	
	
	
	
	private static final String UPDATE_STUDENT = "UPDATE student "
			+ "SET name=?, age=?, sex=?, email=?, password=? "
			+ "WHERE id=?";
	public Integer updateStudent(Student student) {	
		int rows = 0;
		try (
				Connection connection = JdbcDemo.getConnection();//1,2. 取得連線
				PreparedStatement pstmt = connection.prepareStatement(UPDATE_STUDENT); //3.準備指令
		) {
			//3.1傳入?的值
				pstmt.setString(1, student.getName());
				pstmt.setInt(2, student.getAge());
				pstmt.setString(3, student.getSex());
				pstmt.setString(4, student.getEmail());
				pstmt.setString(5, student.getPassword());
				pstmt.setString(6, student.getId());
				
				rows= pstmt.executeUpdate();
				System.out.println(rows);
				
				
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return rows;

		
	}
	
	
	
	
	
	
	private static final String DELETE_STUDENT = "DELETE FROM student where id = ?";
	public boolean deleteStudent(String son) {	
		int n = 0;
		try (
				Connection connection = JdbcDemo.getConnection();//1,2. 取得連線
				PreparedStatement pstmt = connection.prepareStatement(DELETE_STUDENT); //3.準備指令
		) {
			//3.1傳入?的值
				pstmt.setString(1, son);
				
				int rows = pstmt.executeUpdate();//4.執行指令
				System.out.println("插入語句執行結果-----" + rows);
				if (rows>0) {
					System.out.println("刪除資料成功");
				}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("刪除資料失敗："+e);
		}
		return n > 0 ? true : false;
	}
}
