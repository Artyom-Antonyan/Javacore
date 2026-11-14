package homeworks.employee;


public class EmployeeStorage {

    private Employe[] array = new Employe[10];
    private int size = 0;

    public void add(Employe s) {
        if (size == array.length) {
            extend();
        }
        array[size++] = s;
    }

    private void extend() {
        Employe[] tmp = new Employe[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public Employe getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
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

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword)
                    || array[i].getSurname().contains(keyword)
                    || array[i].getEmployeeID().contains(keyword)
                    || array[i].getSalary().contains(keyword)
                    || array[i].getCompany().contains(keyword)
                    || array[i].getPosition().contains(keyword)) {
                System.out.println(array[i] + " ");
            }
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

    public void setSearchEmployeesByCompanyName(String company) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i].getCompany().equals(company)) {
                System.out.println("Employees: ");
                System.out.println(array[i] + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found for company " + company + ".");
        }
    }

}
