package com;

public class Employee {
	
private int id;
private String name;
private float salary;
private Address add, localadd;

	public Employee() {				//Constuctor 
		System.out.println("Object Created....");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Address getLocaladd() {
		return localadd;
	}

	public void setLocaladd(Address localadd) {
		this.localadd = localadd;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("This is Simple Method");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + ", localadd="
				+ localadd + "]";
	}
	
}