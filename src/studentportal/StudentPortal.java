package studentportal;

import java.util.Scanner;

public class StudentPortal {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addStudent();
                    break;
                case "2":
                    studentStorage.print();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "4":
                    searchStudentByCourse();
                    break;
                default:
                    System.out.println("command not found!");

            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for add Student");
        System.out.println("Please input 2 for print all Students");
        System.out.println("Please input 3 for search Student");
        System.out.println("Please input 4 for search Student by course");
    }

    private static void searchStudentByCourse() {
        System.out.println("Please input course");
        String course = scanner.nextLine();
        studentStorage.searchByCourse(course);
    }

    private static void searchStudent() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        studentStorage.search(keyword);
    }

    private static void addStudent() {
        System.out.println("Please input name,surname,phone,course");
        String studentDataStr = scanner.nextLine();
        String[] studentDataArr = studentDataStr.split(",");

        Student student = new Student(studentDataArr[0],
                studentDataArr[1],
                studentDataArr[2],
                studentDataArr[3]);

        studentStorage.add(student);
        System.out.println("Student added!!!");
    }
}
