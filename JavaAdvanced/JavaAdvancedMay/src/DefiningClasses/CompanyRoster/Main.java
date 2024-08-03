package DefiningClasses.CompanyRoster;

import java.util.*;

/*
@CIHAN GUR

Define a class Employee that holds the following information: name, salary, position, department, email, and age.
The name, salary, position, and department are mandatory, while the rest are optional.
Your task is to write a program that takes N lines of information about employees from the console and calculates
the department with the highest average salary, and prints for each employee in that department his name, salary,
email, and age - sorted by salary in descending order. If an employee doesn't have an email – in place of that field,
you should print "n/a" instead, if he doesn't have an age – print "-1" instead. Print in the following format:
"Highest Average Salary: {department}
{name1} {salary1} {email1} {age1}
{name2} {salary2} {email2} {age2}
…
{namen} {salaryn} {emailn} {agen}"
The salary should be printed to two decimal places after the separator.
Hint: You can define a Department class that holds a list of employees.


>>>>>INPUT
4
Peter 120.00 Dev Development peter@abv.bg 28
Tina 333.33 Manager Marketing 33
Sam 840.20 ProjectLeader Development sam@sam.com
George 0.20 Freeloader Nowhere 18
>>>>>OUTPUT
Highest Average Salary: Development
Sam 840.20 sam@sam.com -1
Peter 120.00 peter@abv.bg 28

>>>>>INPUT
6
Silver 496.37 Temp Coding silver@yahoo.com
Sam 610.13 Manager Sales
John 609.99 Manager Sales john@abv.bg 44
Venci 0.02 Director BeerDrinking beer@beer.br 23
Andre 700.00 Director Coding
Popeye 13.3333 Sailor SpinachGroup popeye@pop.ey
>>>>>OUTPUT
Highest Average Salary: Sales
Sam 610.13 n/a -1
John 609.99 john@abv.bg 44
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Department> departments = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String employeeInfo = scanner.nextLine();
            String[] employeeData = employeeInfo.split("\\s+");
            String name = employeeData[0];
            double salary = Double.parseDouble(employeeData[1]);
            String position = employeeData[2];
            String departmentName = employeeData[3];
            String email = "n/a";
            int age = -1;
            if (employeeData.length == 6) {
                email = employeeData[4];
                age = Integer.parseInt(employeeData[5]);
            } else if (employeeData.length == 5) {
                if (employeeData[4].contains("@")) {
                    email = employeeData[4];
                } else {
                    age = Integer.parseInt(employeeData[4]);
                }
            }
            Employee employee = new Employee(name, salary, position, email, age);
            Department department = getDepartmentByName(departments,departmentName);
            department.addEmployee(employee);
        }

        Collections.sort(departments, Comparator.comparing(Department::getDepartmentSalary).reversed());
        Department highestSalary = departments.get(0);
        Collections.sort(highestSalary.getEmployees(), Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(highestSalary);
    }


    private static Department getDepartmentByName(List<Department> departments, String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        Department department = new Department(departmentName);
        departments.add(department);
        return department;
    }
}
