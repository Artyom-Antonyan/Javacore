package homeworks.employee;


import java.util.Scanner;


public class EmployeeDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static final String EXIT = "0";
    private static final String ADD_EMPLOYEE = "1";
    private static final String PRINT_ALL_EMPLOYESS = "2";
    private static final String SEARCH_EMPLOYEE_BY_ID = "3";
    private static final String SEARCH_EMPLOYEES_BY_COMPANY_NAME = "4";


    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
            printCommands();


            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                  addEmployee();
                    break;
                case PRINT_ALL_EMPLOYESS:
                   employeeStorage.print();

                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                     searchEmployeeById();
                    break;
                case SEARCH_EMPLOYEES_BY_COMPANY_NAME:
                   setSearchEmployeesByCompanyName();
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");

            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_EMPLOYEE + " for ADD EMPLOYEE");
        System.out.println("Please input " + PRINT_ALL_EMPLOYESS + " for  PRINT ALL EMPLOYEES");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for  SEARCH EMPLOYEE BY ID");
        System.out.println("Please input " + SEARCH_EMPLOYEES_BY_COMPANY_NAME + " for  SEARCH EMPLOYEES BY COMPANY NAME");
    }

    private static void addEmployee() {
        System.out.println("Please input employee name:");
        String name = scanner.nextLine();

        System.out.println("Please input employee surname:");
        String surname = scanner.nextLine();

        System.out.println("Please input employee ID:");
        String id = scanner.nextLine();

        System.out.println("Please input employee salary:");
        String salary = scanner.nextLine();

        System.out.println("Please input employee company:");
        String company = scanner.nextLine();

        System.out.println("Please input employee position:");
        String position = scanner.nextLine();

        Employe employee = new Employe(
                name, surname, id, salary, company, position
        );

        employeeStorage.add(employee);

        System.out.println("Employee successfully added!");
    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee ID: ");
        String employeeId = scanner.nextLine();

        employeeStorage.searchEmployeeById(employeeId);
    }
    private static void setSearchEmployeesByCompanyName() {
        System.out.println("Please input company name: ");
        String company = scanner.nextLine();

        employeeStorage.setSearchEmployeesByCompanyName(company);
    }



}

