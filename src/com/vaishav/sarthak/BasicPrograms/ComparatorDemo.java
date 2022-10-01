package com.vaishav.sarthak.BasicPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"q", 100);
		Employee e2=new Employee(102,"a", 400);
		Employee e3=new Employee(103,"f", 300);
		Employee e4=new Employee(104,"c", 600);
		Employee e5=new Employee(105,"d", 200);
		Employee e6=new Employee(106,"e", 900);
		
		Employee[] array=new Employee[] {e3,e4,e1,e2,e5,e6};
		
		Arrays.sort(array, (Employee x, Employee y) ->  x.getEmpId()-y.getEmpId());
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, (Employee p, Employee q) ->  p.getName().compareTo(q.getName()));
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array, (Employee a, Employee b) ->  a.getSalary()-b.getSalary());
		System.out.println(Arrays.toString(array));
		
		Thread t=new Thread( () -> System.out.println("hello"));
		t.start();
	}

}

class Employee{
	
	private int empId;
	private String name;
	private int salary;
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
}


