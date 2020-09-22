package org.trishinfotech.builder.example;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee.EmployeeBuilder().empNo(100).name("Brijesh").projectName("Builder Pattern")
				.build();
		System.out.println(emp1);
	}
}
