package javalearning;
 class Person {
	
	private String name;
	private int age;
	
	
	public Person() {
		super();
	}

	public Person(String name,int age) {
		super();
		this.name = name;
		this.age =age;
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
		Persons person = new Persons("Ludia S");
		System.out.println("Person's Name: "+person.getName());
		System.out.println("Person's Age: "+person.getAge());
	}


}
public class Employee extends Person{
	
	private String employeeId;
	private double salary;
	
	public Employee(String name, int age, String employeeId, int salary) {
		super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("Stanly",34,"JET0011",35000);
		System.out.println("Name" + employee.getName());
        System.out.println("Age: " + employee.getAge());
		System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
	}

}
