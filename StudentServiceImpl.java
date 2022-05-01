package tw.com.phctw.service;
import java.util.List;

import tw.com.phctw.bean.Student;
import tw.com.phctw.dao.StudentDao;


public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao = new StudentDao();
	

	@Override
	public List<Student> selectStudent() {
		return dao.selectStudent();
	}

	@Override
	public Boolean insertStudent(Student student) {
		return dao.insertStudent(student);
	}

	@Override
	public Integer updateStudent(Student student) {
		return dao.updateStudent(student);
	}

	@Override
	public Boolean deleteStudent(String son) {
		return dao.deleteStudent(son);
	}

	
}
