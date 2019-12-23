import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.*;
import org.junit.Test;

public class StudentTest {

	Student student;
	String name = "newName";
	Module newModule = new Module("modName", 10101, new ArrayList<Student>(), new ArrayList<Course>());
	Course newCourse = new Course("courseName", new ArrayList<Student>(), new ArrayList<Module>(), new DateTime(), new DateTime());
	Date newDOB = new Date();
	
	@Before
	public void setup() throws Exception {
		student = new Student("defaultName", 10, 11111, new Date(), new ArrayList<Course>(), new ArrayList<Module>());
	}
	
	@After
	public void tearDown() throws Exception {
		student = null;
		assertEquals(null, student);
	}
	
	@Test
	public void testStudent() {
		assertNotEquals(null, student);
	}

	@Test
	public void testGetName() {
		assertEquals("defaultName" , student.getName());
	}

	@Test
	public void testSetName() {
		student.setName(this.name);
		assertEquals(this.name, student.getName());
	}

	@Test
	public void testGetAge() {
		assertEquals(10, student.getAge());
	}

	@Test
	public void testSetAge() {
		student.setAge(15);
		assertEquals(15, student.getAge());
	}

	@Test
	public void testGetId() {
		assertEquals(11111, student.getId());
	}

	@Test
	public void testSetId() {
		student.setId(100);
		assertEquals(100, student.getId());
	}

	@Test
	public void testGetDateOfBirth() {
		student.setDateOfBirth(newDOB);
		assertEquals(newDOB, student.getDateOfBirth());
	}

	@Test
	public void testSetDateOfBirth() {
		student.setDateOfBirth(newDOB);
		assertEquals(newDOB, student.getDateOfBirth());
	}

	@Test
	public void testGetUsername() {
		assertEquals("defaultName11111", student.getUsername());
	}

	@Test
	public void testAddCourse() {
		student.addCourse(newCourse);
		assertEquals(newCourse, student.getCourses().get(0));
	}

	@Test
	public void testGetCourses() {
		student.addCourse(newCourse);
		assertEquals(newCourse, student.getCourses().get(0));
	}

	@Test
	public void testAddModule() {
		student.addModule(newModule);
		assertEquals(newModule, student.getModules().get(0));
	}

	@Test
	public void testGetModules() {
		student.addModule(newModule);
		assertEquals(newModule, student.getModules().get(0));
	}

}
