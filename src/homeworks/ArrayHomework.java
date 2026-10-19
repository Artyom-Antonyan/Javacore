package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {

        //        Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը

        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of 6: " + count);

        System.out.println("--------------");

        //    Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը


        for (int i = 0; i < numbers.length / 2; i++) {

            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;


        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("--------------");


        //        Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը


        int[] numbers1 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};

        int repeatedCount = 0;

        for (int i = 0; i < numbers1.length; i++) {
            boolean alreadyCounted = false;


            for (int k = 0; k < i; k++) {
                if (numbers1[i] == numbers1[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count2 = 0;


            for (int j = 0; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j]) {
                    count2++;
                }
            }

            if (count2 > 1) {
                repeatedCount++;
            }
        }

        System.out.println("Repeated numbers count: " + repeatedCount);

        System.out.println();
        System.out.println("--------------");



//        Խնդիր 4 — Հաշվել ձայնավորների քանակը

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == 'ա' || c == 'ե' || c == 'է' ||
                    c == 'ը' || c == 'ի' || c == 'ո' ||
                    c == 'օ') {
                count1++;
            }

        }

        System.out.println("Vowels count: " + count1);












    }







}
