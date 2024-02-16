package javalearning;

public class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
		this.age =18;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person person = new Person("Ludia S");
		System.out.println("Person's Name: "+person.getName());
		System.out.println("Person's Age: "+person.getAge());
	}


}
