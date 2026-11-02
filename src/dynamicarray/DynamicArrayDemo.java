package dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        DynamicArray da1 = new DynamicArray();
        DynamicArray da2 = new DynamicArray();
        DynamicArray da3 = new DynamicArray();

        System.out.println("Խնդիրների սկիզբ");

        //   Խնդիր 1 — add(int value)
        System.out.println("Խնդիր 1 ");

        da.add(5);
        da.add(10);
        da.add(15);

        da.print();

        //       Խնդիր 2 — extend()
        System.out.println("Խնդիր 2 ");
        for (int i = 1; i <= 35; i++) {
            da1.add(i);
        }

        da1.print();

        // Խնդիր 3 — getByIndex(int index)
        System.out.println("Խնդիր 3 ");

        da2.add(10);
        da2.add(20);
        da2.add(30);

        System.out.println(da2.getByIndex(0));
        System.out.println(da2.getByIndex(2));
        System.out.println(da2.getByIndex(5));
        System.out.println(da2.getByIndex(-1));


        //   Խնդիր 4 — print()
        System.out.println("Խնդիր 4 ");

        da3.add(4);
        da3.add(8);
        da3.add(12);

        da3.print();

        System.out.println();
        System.out.println("Խնդիրների ավարտ");
        System.out.println();
        System.out.println("Թեստերի սկիզբ");
        System.out.println();

        // Թեստ 1 — Ավելացնել էլեմենտներ
        System.out.println("Թեստ 1");

        DynamicArray daTest1 = new DynamicArray();

        daTest1.add(5);
        daTest1.add(10);
        daTest1.add(9);
        daTest1.add(6);
        daTest1.add(12);

        daTest1.print();

        //     Թեստ 2 — Զանգվածի մեծացում
        System.out.println("Թեստ 2");

        DynamicArray daTest2 = new DynamicArray();

        for (int i = 1; i <= 15; i++) {
            daTest2.add(i);
        }
        daTest2.print();

        //        Թեստ 3 — Կրկնակի մեծացում
        System.out.println("Թեստ 3");

        DynamicArray daTest3 = new DynamicArray();

        for (int i = 1; i <= 25; i++) {
            daTest3.add(i * 10);
        }
        daTest3.print();

         //  Թեստ 4 — Ինդեքսով ստանալ էլեմենտ
        System.out.println("Թեստ 4");
        DynamicArray daTest4 = new DynamicArray();

        daTest4.add(100);
        daTest4.add(200);
        daTest4.add(300);

        System.out.println(daTest4.getByIndex(0));
        System.out.println(daTest4.getByIndex(2));
        System.out.println(daTest4.getByIndex(-1));
        System.out.println(daTest4.getByIndex(5));






    }


}

