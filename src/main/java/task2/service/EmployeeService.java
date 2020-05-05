package task2.service;

import task2.bean.Employee;
import task2.bean.Position;

import java.util.HashSet;
import java.util.Set;

public class EmployeeService {
    private Set<Employee> employees = new HashSet<>();

    public EmployeeService() {

    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hire(String name, Position position) {
        employees.add(new Employee(name, position));
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }
}
