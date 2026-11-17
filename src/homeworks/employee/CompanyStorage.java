package homeworks.employee;

import java.util.Arrays;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {

        if (getById(company.getCompanyId()) != null) {
            System.out.println("Company already exists!");
            return;
        }

        if (size == companies.length) {
            companies = Arrays.copyOf(companies, companies.length + 10);
        }

        companies[size++] = company;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String id) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getCompanyId().equals(id)) {
                return companies[i];
            }
        }
        return null;
    }
}
