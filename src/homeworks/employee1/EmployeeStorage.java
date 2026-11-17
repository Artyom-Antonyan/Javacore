package homeworks.employee1;


public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee s) {
        if (size == array.length) {
            extend();
        }
        array[size++] = s;
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }



    public void print() {
        if (size == 0) {
            System.out.println("No employees found!");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println(array[i]);
            System.out.println();
        }
    }


    public void searchEmployeeById(String employeeID) {

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equals(employeeID)) {
                System.out.println("Employee found: ");
                System.out.println(array[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + employeeID + " not found.");
        }

    }

    public void searchEmployeesByCompanyName(String company) {
        boolean found = false;
        System.out.println("Employees: ");

        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equals(company)) {

                System.out.println(array[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + company + ".");
        }
    }

}
