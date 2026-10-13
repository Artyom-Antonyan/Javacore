package homeworks;

public class ArrayUtil {


    public static void main(String[] args) {


        //  Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


        System.out.println();

        //Խնդիր 2 — Տպել առաջին էլեմենտը

        System.out.println("First Element: " + numbers[0]);

        // Խնդիր 3 — Տպել վերջին էլեմենտը

        System.out.println("Last Element: " + numbers[numbers.length - 1]);

        //  Խնդիր 4 — Տպել զանգվածի երկարությունը

        System.out.println("Array length: " + numbers.length);

        // Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

        }
        System.out.println("Minimum number:" + min);


        //  Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտներ

        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 != 0) {
            System.out.println("Middle element: " + numbers[numbers.length / 2]);
        } else if (numbers.length % 2 == 0) {
            System.out.println("Middle elements: " + numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]);
        }

        //  Խնդիր 7 — Հաշվել զույգ թվերի քանակը
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] % 2 == 0 ) {
                 count ++;
             }
        }
        System.out.println("Even numbers count: " + count);


        //       Խնդիր 8 — Հաշվել կենտ թվերի քանակը

        int count1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 ) {
                count1 ++;
            }
        }
        System.out.println("Odd numbers count: " + count1);

        //       Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
          sum =  sum + numbers[i];
        }
        System.out.println("Sum: " + sum);

        //        Խնդիր 10 — Հաշվել միջին թվաբանականը

         int sum1 = 0;
         int count2 = 0;

         for (int i = 0; i < numbers.length; i++) {
            sum1 =  sum1 + numbers[i];
        }

         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i] % 2 == 0 || numbers[i] % 2 != 0 ) {
                 count2++;
             }
         }
         double Average = sum1 / count2;
        System.out.println("Average: " + Average);
    }
}
