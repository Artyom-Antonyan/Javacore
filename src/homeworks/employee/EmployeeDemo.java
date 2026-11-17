
package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);

    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {

            System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");
            System.out.println("0 - EXIT");
            System.out.println("1 - ADD EMPLOYEE");
            System.out.println("2 - PRINT ALL EMPLOYEES");
            System.out.println("3 - SEARCH EMPLOYEE BY ID");
            System.out.println("4 - SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5 - ADD COMPANY");
            System.out.println("6 - PRINT ALL COMPANIES");
            System.out.println("7 - SEARCH COMPANY BY ID");
            System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9 - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
            System.out.println("==========================================");

            System.out.print("Choose command: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {

                case 0:
                    isRun = false;
                    break;

                case 1:
                    addEmployee();
                    break;

                case 2:
                    employeeStorage.printAll();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    System.out.print("Enter company name: ");
                    String companyName = scanner.nextLine();
                    employeeStorage.printByCompanyName(companyName);
                    break;

                case 5:
                    addCompany();
                    break;

                case 6:
                    companyStorage.printAll();
                    break;

                case 7:
                    searchCompany();
                    break;

                case 8:
                    System.out.print("Enter company ID: ");
                    String companyId = scanner.nextLine();
                    employeeStorage.printByCompanyId(companyId);
                    break;

                case 9:
                    changeEmployeeCompany();
                    break;

                case 10:
                    printEmployeeCompany();
                    break;

                default:
                    System.out.println("Invalid command!");
            }
        }

        System.out.println("Program finished!");
    }

    private static void addCompany() {

        System.out.print("Enter company ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter company name: ");
        String name = scanner.nextLine();

        System.out.print("Enter industry: ");
        String industry = scanner.nextLine();

        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        Company company = new Company(id, name, industry, country);

        companyStorage.add(company);
    }

    private static void addEmployee() {

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();

        System.out.print("Enter company ID: ");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found! Please add company first.");
            return;
        }

        Employee employee = new Employee(
                name, surname, id, salary, company, position
        );

        employeeStorage.add(employee);
    }

    private static void searchEmployee() {

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        Employee employee = employeeStorage.getById(id);

        if (employee != null) {
            System.out.println("Employee found:");
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }
    }

    private static void searchCompany() {

        System.out.print("Enter company ID: ");
        String id = scanner.nextLine();

        Company company = companyStorage.getById(id);

        if (company != null) {
            System.out.println("Company found:");
            System.out.println(company);
        } else {
            System.out.println("Company not found!");
        }
    }

    private static void changeEmployeeCompany() {

        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();

        Employee employee = employeeStorage.getById(employeeId);

        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("Current company: " +
                employee.getCompany().getName());

        System.out.print("Enter new company ID: ");
        String companyId = scanner.nextLine();

        Company company = companyStorage.getById(companyId);

        if (company == null) {
            System.out.println("Company not found!");
            return;
        }

        employee.setCompany(company);

        System.out.println("Employee company successfully changed!");
        System.out.println("New company: " + employee.getCompany().getName());
    }

    private static void printEmployeeCompany() {

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        Employee employee = employeeStorage.getById(id);

        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("Employee: " +
                employee.getName() + " " + employee.getSurname());

        System.out.println("Company information:");
        System.out.println(employee.getCompany());
    }
}
