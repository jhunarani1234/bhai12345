package Oops;

import java.util.*;

class Employee1 {
	int id;
	String name;
	float salary;

	void insert(int i, String n, float s) {
		this.id = i;
		this.name = n;
		this.salary = s;
	
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

	 class Employee {
		public static void main(String[] args) {
			Employee1 e1 = new Employee1();
			Employee1 e2 = new Employee1();
			Employee1 e3 = new Employee1();
			e1.insert(101, "ajeet", 45000);
			e2.insert(102, "irfan", 25000);
			e3.insert(103, "nakul", 55000);
			e1.display();
			e2.display();
			e3.display();

		}

	}
