import java.util.ArrayList;
import java.util.List;

public class Module {

	private String name = "";
	private int iD;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public Module(String name, int id, List<Student> students, List<Course> courses) {
		this.name = name;
		this.iD = id;
		this.students = students;
		this.courses = courses;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setId(int newId) {
		this.iD = newId;
	}
	
	public int getId() {
		return this.iD;
	}
	
	public void addStudent(Student newStudent) {
		students.add(newStudent);
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addCourse(Course newCourse) {
		courses.add(newCourse);
	}
	
	public List<Course> getCourses() {
		return courses;
	}
}
