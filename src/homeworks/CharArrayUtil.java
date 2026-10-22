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

        char[] chars2 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        boolean palindrome =  true;
        for (int i = 0; i < chars2.length / 2; i++) {
           if(chars2[i] != chars2[chars2.length - 1 - i]){
               palindrome = false;
               break;
           }
        }
        System.out.println(palindrome);
    }
}

