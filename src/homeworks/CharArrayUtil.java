package homeworks;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        //     Խնդիր 1 — Տպել բոլոր սիմվոլները

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

        //      Խնդիր 2 — Հաշվել սիմվոլների քանակը

        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            count++;
        }
        System.out.println("Characters count: " + count);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);


        //      Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը

        char c = 'a';
        int count1 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count1++;
            }
        }
        System.out.println("Character 'a' count: " + count1);

        //      Խնդիր 4 — Հաշվել ձայնավորների քանակը

        int count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            char c1 = chars[i];
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' || c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U') {
                count2++;
            }

        }
        System.out.println("Vowels count: " + count2);

        //   Խնդիր 5 — Հաշվել բաղաձայնների քանակը

        int count4 = 0;
        for (int i = 0; i < chars.length; i++) {
            char c1 = chars[i];
            if (c1 == 'b' || c1 == 'c' || c1 == 'd' || c1 == 'f' ||
                    c1 == 'g' || c1 == 'h' || c1 == 'j' || c1 == 'k' ||
                    c1 == 'l' || c1 == 'm' || c1 == 'n' || c1 == 'p' ||
                    c1 == 'q' || c1 == 'r' || c1 == 's' || c1 == 't' ||
                    c1 == 'v' || c1 == 'w' || c1 == 'x' || c1 == 'y' ||
                    c1 == 'z' || c1 == 'B' || c1 == 'C' || c1 == 'D' ||
                    c1 == 'F' || c1 == 'G' || c1 == 'H' || c1 == 'J' ||
                    c1 == 'K' || c1 == 'L' || c1 == 'M' || c1 == 'N' ||
                    c1 == 'P' || c1 == 'Q' || c1 == 'R' || c1 == 'S' ||
                    c1 == 'T' || c1 == 'V' || c1 == 'W' || c1 == 'X' ||
                    c1 == 'Y' || c1 == 'Z') {
                count4++;
            }

        }
        System.out.println("Consonants  count: " + count4);


        //         Խնդիր 6 — Հաշվել բացատների քանակը

        char c3 = ' ';
        int count3 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c3) {
                count3++;
            }
        }
        if (count3 == 0) {
            System.out.println(0);
        }
        System.out.println("Space count: " + count3);

        //   Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)

        char[] charsReverse = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };


        for (int i = 0; i < charsReverse.length / 2; i++) {

            char temp = charsReverse[i];
            charsReverse[i] = charsReverse[charsReverse.length - 1 - i];
            charsReverse[charsReverse.length - 1 - i] = temp;
        }
        for (int i = 0; i < charsReverse.length; i++) {
            System.out.print(charsReverse[i]);
        }

        System.out.println();

        //     Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը


        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }


        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // Խնդիր 9 — Փոխարինել տրված սիմվոլը

        char oldChar = 'a';
        char newChar = '*';

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

        //     Խնդիր 10 — Ստուգել Palindrome-ը


        boolean palindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);


        // Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը


        char[] charsBonus1 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int indexBonus = 0;
        for (int i = 0; i < charsBonus1.length; i++) {
            if (charsBonus1[i] == target) {
                indexBonus = i;
                break;
            }
        }

        System.out.println("First index: " + indexBonus);


        //   Bonus 2 — Համեմատել երկու char զանգված

        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};

        boolean equal = false;
        int g = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                g++;
            }

        }
        if (g == first.length && g == second.length) {
            equal = true;
            System.out.println("Arrays are equal: " + equal);

        }


        // Bonus 3 — Հեռացնել կրկնվող սիմվոլները


        char[] charsBonus3 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < charsBonus3.length; i++) {
            boolean repeat = false;

            for (int j = 0; j < i; j++) {
                if (charsBonus3[i] == charsBonus3[j]) {
                    repeat = true;
                    break;
                }
            }

            if (!repeat) {
                System.out.print(charsBonus3[i] + " ");
            }


        }


    }
}