package tw.com.phctw.bean;

public class Student{
	private String id;
	private String name;
	private int age;
	private String sex;
	private String email;
	private String password;
	

	public Student(String id, String name, int age, String sex, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.password = password;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
		
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() 
				+ ":\t id=" + id 
				+ ",\n name=" + name 
				+ ",\n age=" + age 
				+ ",\n sex=" + sex 
				+ ",\n email=" + email 
				+ ",\n password=" + password + "\n";
	}

}
