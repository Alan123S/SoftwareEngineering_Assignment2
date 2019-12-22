import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;

public class CourseTest {
	
	Course course;
	String name = "newName";
	Student newStudent = new Student("studName", 10, 1111, new Date(), new ArrayList<Course>(), new ArrayList<Module>());
	Module newModule = new Module("modName", 10101, new ArrayList<Student>(), new ArrayList<Course>());
	DateTime newStartTime = new DateTime();
	DateTime newEndTime = new DateTime();
	
	@Test
	public void testCourse() {
		course = new Course("defaultName", new ArrayList<Student>(), new ArrayList<Module>(), new DateTime(), new DateTime());
		assertNotEquals(null, course);
	}

	@Test
	public void testGetName() {
		assertEquals("defaultName" ,course.getName());
	}
	
	@Test
	public void testSetName() {
		course.setName(this.name);
		assertEquals(this.name, course.getName());
	}

	@Test
	public void testAddStudent() {
		course.addStudent(newStudent);
		assertEquals(newStudent, course.getStudents().get(0));
	}

	@Test
	public void testGetStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(newStudent);
		course.addStudent(newStudent);
		assertEquals(students, course.getStudents());
	}

	@Test
	public void testAddModule() {
		course.addModule(newModule);
		assertEquals(newModule, course.getModules().get(0));
	}

	@Test
	public void testGetModules() {
		List<Module> modules = new ArrayList<Module>();
		modules.add(newModule);
		course.addModule(newModule);
		assertEquals(modules, course.getModules());
	}

	@Test
	public void testSetStartDate() {
		course.setStartDate(newStartTime);
		assertEquals(newStartTime, course.getStartDate());
	}

	@Test
	public void testGetStartDate() {
		course.setStartDate(newStartTime);
		assertEquals(newStartTime, course.getStartDate());
	}

	@Test
	public void testSetEndDate() {
		course.setEndDate(newEndTime);
		assertEquals(newEndTime, course.getEndDate());
	}

	@Test
	public void testGetEndDate() {
		course.setEndDate(newEndTime);
		assertEquals(newEndTime, course.getEndDate());
	}

}
