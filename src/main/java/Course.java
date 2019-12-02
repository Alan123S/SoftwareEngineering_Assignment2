import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course {

	private String name = "";
	private List<Student> students = new ArrayList<Student>();
	private List<Module> modules = new ArrayList<Module>();
	private DateTime startDate = new DateTime();
	private DateTime endDate = new DateTime();
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addStudent(Student newStudent) {
		students.add(newStudent);
	}
	public List<Student> getStudents() {
		return students;
	}
	
	public void addModule(Module newModule) {
		modules.add(newModule);
	}
	public List<Module> getModules() {
		return modules;
	}
	
	public void setStartDate(DateTime newStartDate) {
		this.startDate = newStartDate;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setEndDate(DateTime newEndDate) {
		this.endDate = newEndDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
}
