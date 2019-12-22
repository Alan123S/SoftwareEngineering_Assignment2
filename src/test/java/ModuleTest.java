import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModuleTest {

	Module module;
	Student newStudent = new Student("studName", 10, 1111, new Date(), new ArrayList<Course>(), new ArrayList<Module>());
	Course newCourse = new Course("courseName", new ArrayList<Student>(), new ArrayList<Module>(), new DateTime(), new DateTime());
	
	@Before
	public void setup() throws Exception {
		module = new Module("defaultName", 414, new ArrayList<Student>(), new ArrayList<Course>());
	}
	
	@After
	public void tearDown() throws Exception {
		module = null;
		assertEquals(null, module);
	}
	
	@Test
	public void testModule() {
		assertNotEquals(null, module);
	}

	@Test
	public void testGetName() {
		assertEquals("defaultName", module.getName());
	}

	@Test
	public void testSetName() {
		module.setName("newName");
		assertEquals("newName", module.getName());
	}

	@Test
	public void testSetId() {
		module.setId(11);
		assertEquals(11, module.getId());
	}

	@Test
	public void testGetId() {
		module.setId(11);
		assertEquals(11, module.getId());
	}

	@Test
	public void testAddStudent() {
		module.addStudent(newStudent);
		assertEquals(newStudent, module.getStudents().get(0));
	}

	@Test
	public void testGetStudents() {
		module.addStudent(newStudent);
		assertEquals(newStudent, module.getStudents().get(0));
	}

	@Test
	public void testAddCourse() {
		module.addCourse(newCourse);
		assertEquals(newCourse, module.getCourses().get(0));
	}

	@Test
	public void testGetCourses() {
		module.addCourse(newCourse);
		assertEquals(newCourse, module.getCourses().get(0));
	}

}
