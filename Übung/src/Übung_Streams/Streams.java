package Übung_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
	private List<Person> employees;
	
	public Streams(List<Person> list) {
		this.employees = list;
	}
	
	public List<Person> getEmployees() {
		return employees;
	}
	
	public void setList(List<Person> list) {
		this.employees = list;
	}
	
	public void printList() {
		try {
			employees.stream()
			.forEach(x -> System.out.println(x));
		}
		catch(NullPointerException e) {
			System.out.println("Die Liste ist leer!");
		}
	}
	
	//Aufgabe 1
	public List<Person> filterByName(String name) {
		return employees.stream().filter(s -> s.getName().equals(name)).collect(Collectors.toList());
	}
	
	public List<Person> filterByMinAge(int age) {
		return employees.stream().filter(a -> a.getAge()>=age).collect(Collectors.toList());
	}
	
	//Aufgabe 2
	public void sortByName() {
		employees = employees.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
	}
	
	public void sortByAge() {
		employees = employees.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).collect(Collectors.toList());
	}
	
	//Aufgabe 3
	public void updateAge(int year) {
		employees.stream().forEach(s->s.setAge(s.getAge()+year));
	}
	
	//Aufgabe 4
	public double getAverageAge() {
		return employees.stream().collect(Collectors.averagingDouble(s->s.getAge()));
	}
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Stefan" , 27));
		list.add(new Person("Anna" , 21));
		list.add(new Person("Paul" , 18));
		list.add(new Person("Max" , 31));
		list.add(new Person("Lisa" , 20));
		
		Streams streams = new Streams(list);
		
		System.out.println("Das ist die urspruengliche Liste:");
		streams.printList();
		
		System.out.println("- - -\nGefiltert auf Mindestalter 21:");
		streams.setList(streams.filterByMinAge(21));
		streams.printList();
		
		System.out.println("- - -\nGefiltert auf den Namen \"Max\":");
		streams.setList(streams.filterByName("Max"));
		streams.printList();
		
		streams.setList(list);
		
		System.out.println("- - -\nSortiert nach Name:");
		streams.sortByName();
		streams.printList();
		
		System.out.println("- - -\nSortiert nach Alter:");
		streams.sortByAge();
		streams.printList();
		
		System.out.println("- - -\nNach einem Jahr:");
		streams.updateAge(1);
		streams.printList();
		
		System.out.println("- - -\nDurchschnittliches Alter:");
		System.out.println(streams.getAverageAge());
	}
}
