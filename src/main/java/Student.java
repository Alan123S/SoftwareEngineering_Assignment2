import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name = "";
	private int age;
	private int iD;
	private Date dateOfBirth;
	private List<Course> courses = new ArrayList<Course>();
	private List<Module> modules = new ArrayList<Module>();
	
	public Student(String name, int age, int id, Date dob, List<Course> courses, List<Module> modules) {
		this.name = name;
		this.age = age;
		this.iD = id;
		this.dateOfBirth = dob;
		this.courses = courses;
		this.modules = modules;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public int getId() {
		return iD;
	}
	
	public void setId(int newId) {
		this.iD = newId;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date newDOB) {
		this.dateOfBirth = newDOB;
	}
	
	public String getUsername() {
		return name + Integer.toString(iD);
	}
	
	public void addCourse(Course newCourse) {
		courses.add(newCourse);
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public void addModule(Module newModule) {
		modules.add(newModule);
	}
	
	public List<Module> getModules(){
		return modules;
	}
}
