package newHomework;

public class CharArray {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;

            }

        }
        System.out.println(count);
        System.out.println((bolola[bolola.length / 2]) + " " + (bolola[bolola.length / 2 + 1]));
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bolola1[bolola1.length - 2] == 'l' && bolola1[bolola1.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        char[] babola = {'b', 'a', 'b', 'o', 'b', 'a'};
        boolean isBob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                isBob = true;
                break;
            }

        }
        System.out.println(isBob);
        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};

        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;

        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }


    }

}
