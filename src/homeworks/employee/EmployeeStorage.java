
package homeworks.employee;

import java.util.Arrays;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {

        if (getById(employee.getEmployeeID()) != null) {
            System.out.println("Employee already exists!");
            return;
        }

        if (size == employees.length) {
            employees = Arrays.copyOf(employees, employees.length + 10);
        }

        employees[size++] = employee;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
            System.out.println("----------------");
        }
    }

    public Employee getById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void printByCompanyName(String name) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getName().equals(name)) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employees not found!");
        }
    }

    public void printByCompanyId(String id) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().getCompanyId().equals(id)) {
                System.out.println(employees[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employees not found!");
        }
    }
}
