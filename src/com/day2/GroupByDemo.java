package com.day2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee("e102", "Rahul", 25, 35000.0, "HR");
		Employee e2 = new Employee("e101", "Nitin", 24, 45000.0, "IT");
		Employee e3 = new Employee("e105", "Sujay", 29, 35000.0, "HR");
		Employee e4 = new Employee("e106", "Ajay", 23, 50000.0, "IT");
		Employee e5 = new Employee("e103", "Saket", 25, 65000.0, "HR");
		Employee e6 = new Employee("e104", "Vijay", 29, 35000.0, "IT");
		Employee e7 = new Employee("e107", "Anika", 24, 55000.0, "HR");
		Employee e8 = new Employee("e108", "Aniket", 23, 50000.0, "IT");

		List<Employee> empList = List.of(e1, e2, e3, e4, e5, e6, e7, e8);

		// Group by age and counting the persons
		Map<Integer, Long> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getEmpAge, Collectors.counting()));
		System.out.println(empMap);
		empMap.forEach((age, count) -> System.out.println("Age: -" + age + " : " + count + " persons"));

// 

//  dept wise names of emp

		Map<String, List<String>> deptList = empList.stream().collect(Collectors.groupingBy(Employee::getEmpDept,
				Collectors.mapping(Employee::getEmpName, Collectors.toList())));

		deptList.forEach((dept, name) -> System.out.println("Dept: " + dept + " : Names " + name));

// getting the oldest person in each dept

		Map<String, Optional<Employee>> oldestInDept = empList.stream().collect(Collectors
				.groupingBy(Employee::getEmpDept, Collectors.maxBy(Comparator.comparing(Employee::getEmpAge))));

		oldestInDept
				.forEach((dept, name) -> System.out.println("Dept - " + dept + ":- Oldest Emp" + name.orElse(null)));

		// to find the second highest salary of an employee
		Double secondhighSal = empList.stream().map(Employee::getEmpSal).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();

		System.out.println("second highest Salary " + secondhighSal);
	}
}
