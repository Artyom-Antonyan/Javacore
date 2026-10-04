package Homework;

public class Homework2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("_________________");

        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("_________________");







    }
}
