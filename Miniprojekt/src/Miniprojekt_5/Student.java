package Miniprojekt_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Ein Student mit Namen, Geburtsdatum und einer Map von Veranstaltungen, an
 * denen der Student teilgenommen hat, und dafür erzielte Noten
 */
public class Student {

	// Vor-, Nachname
	private String firstName;
	private String lastName;

	// Geburtstag
	private Calendar dateOfBirth = new GregorianCalendar();

	// Abbildung von Veranstaltung auf Note (in Form eines Double-Wertes)
	private Map<Course, Double> grades = new HashMap<>();

	// wird für die formatierte Ausgabe benötigt
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat(
			"dd.MM.yyyy");

	public Student(String firstName, String lastName, int dobYear,int dobMonth, int dobDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		dateOfBirth.set(dobYear, dobMonth, dobDate);

		// Aufgabe
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}

	public Set<Course> getAttendedCourses() {
		return grades.keySet();
	}

	public void setGrade(Course course, double grade) {
		grades.put(course, grade);
	}

	public double getAverageGrade() {
		if(grades.size()==0)
		return 0.0;

		double average=0;
		Object[]  gradesArr =grades.values().toArray();

		for (Object object : gradesArr) {
			average+=(double)object;
		}
		average/=grades.size();
		return average;
	}

	@Override
	public String toString() {
		return String.format("%s %s (%s, Schnitt %.2f)", firstName, lastName,
				DATE_FORMAT.format(dateOfBirth.getTime()), getAverageGrade());
	}
}
