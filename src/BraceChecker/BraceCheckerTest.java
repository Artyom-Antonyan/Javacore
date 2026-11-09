package BraceChecker;



public class BraceCheckerTest {

    public static void main(String[] args) {


        //Թեստ 1 — Ճիշտ փակագծեր
        System.out.println("Թեստ 1");
        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        bc1.check();

        //      Թեստ 2 — Սխալ փակվող փակագիծ
        System.out.println("Թեստ 2");
        BraceChecker bc2= new BraceChecker("Hello from [Java)");
        bc2.check();


        //Պարտադիր թեստեր
        System.out.println("Պարտադիր Թեստեր ");

        BraceChecker bc3 = new BraceChecker("Hello from [Java]");
        bc3.check();

        BraceChecker bc4 = new BraceChecker("{Hello (Java)}");
        bc4.check();

        BraceChecker bc5 = new BraceChecker("{[()]}");
        bc5.check();

        BraceChecker bc6 = new BraceChecker("Hello Java");
        bc6.check();

        BraceChecker bc7 = new BraceChecker("Hello from [Java)");
        bc7.check();

        BraceChecker bc8 = new BraceChecker("{[(])}");
        bc8.check();

        BraceChecker bc9 = new BraceChecker("Hello from Java]");
        bc9.check();

        BraceChecker bc10 = new BraceChecker("{Hello Java");
        bc10.check();

        BraceChecker bc11 = new BraceChecker("((()))");
        bc11.check();

        BraceChecker bc12 = new BraceChecker("(()");
        bc12.check();
    }
}
