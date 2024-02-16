package javalearning;

public class Person {
	
	private String name;
	private int age =18;
	
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Person.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person("Ludia S");
		System.out.println("Person's Name: "+person.getName());
		System.out.println("Person's Age: "+Person.getAge());
	}


}
