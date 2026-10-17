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
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        //        Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը




















    }


}
