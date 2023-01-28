package Miniprojekt_5;



import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementierung des Database-Interfaces, die Objekte über Listen des Java
 * Collection-Framework direkt im Speicher verwaltet
 */
public class InMemoryDatabase implements Database {

	private List<Student> students = new LinkedList<>();
	private List<Course> courses = new LinkedList<>();

	@Override
	public void insertStudent(Student student) {
		students.add(student);
	}

	@Override
	public void insertStudents(List<Student> students) {
		this.students.addAll(students);
	}

	@Override
	public int countStudents() {
		return students.size();
	}

	@Override
	public List<Student> getStudents() {
		List<Student> s=new LinkedList<Student>();
		s.addAll(students);
		return s;
	}

	@Override
	public List<Student> getStudentsBornAfter(Calendar date) {
		List<Student> s=new LinkedList<Student>();

		for (Student student : students) {
			if(student.getDateOfBirth().compareTo(date)>0)
			s.add(student);
		}

		return s;
	}

	@Override
	public List<Student> getGoodStudents(double gradeThreshold) {
		List<Student> s=new LinkedList<Student>();

		for (Student student : students) {
			if(student.getAverageGrade()<gradeThreshold)
			s.add(student);
		}

		return s;
	}

	@Override
	public List<Student> getGoodStudentsOrderedByGrade(double gradeThreshold) {
		List<Student> s=getGoodStudents(gradeThreshold);
		s.sort(new GradeComparator());

		return s;
	}

	@Override
	public List<Student> getStudentsAttendingCourse(Course course) {
		List<Student> s=new LinkedList<Student>();

		for (Student student : students) {
			if(student.getAttendedCourses().contains(course))
			s.add(student);
		}

		return s;
	}

	@Override
	public void insertCourse(Course course) {
		courses.add(course);
	}

	@Override
	public List<Course> getCourses() {
		List<Course> c=new LinkedList<Course>();

		c.addAll(courses);

		return c;
	}

	@Override
	public List<Course> getCoursesInTerm(Term term) {
		List<Course> c=new LinkedList<Course>();

		for (Course course : courses) {
			if(course.getTerm()==term)
			c.add(course);
		}

		return c;
	}

	@Override
	public int countCourses() {
		return courses.size();
	}
}
