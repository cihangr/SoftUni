package DefiningClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;


    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();

    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public double getDepartmentSalary () {
        double salary = 0;
        for (Employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Highest Average Salary: ").append(this.name).append(System.lineSeparator());
        for (Employee emp : this.employees){
            sb.append(emp.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
