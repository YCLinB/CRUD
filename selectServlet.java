package tw.com.phctw.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.phctw.bean.Student;
import tw.com.phctw.dao.StudentDao;
import tw.com.phctw.service.StudentService;
import tw.com.phctw.service.StudentServiceImpl;

@WebServlet("/selectServlet")
public class selectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public selectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentDao dao = new StudentDao();
		List<Student> student = dao.selectStudent();
		for(Student s:student){  
	        System.out.println("<tr><td>"+s.getId()+
	        				   "</td><td>"+s.getName()+
	        				   "</td><td>"+s.getAge()+
	        				   "</td><td>"+s.getSex()+
	        				   "</td><td>"+s.getEmail()+
	        				   "</td><td>"+s.getPassword());  
	    } 
		request.setAttribute("student", student);
		request.getRequestDispatcher("/showStudent.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
