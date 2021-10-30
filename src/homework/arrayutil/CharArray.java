package homework.arrayutil;

public class CharArray {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i]) {
                count++;
            }

        }
        System.out.println("count of " + "'" + c + "'" + " = " + count);
        System.out.println();

        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};

        System.out.println(bolola1[bolola1.length / 2 - 1] + " " + bolola1[bolola1.length / 2]);
        System.out.println();

        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char a = 'l';
        char b = 'y';
        boolean isfound = false;
        for (char x : bolola2) {
            if (bolola2[bolola2.length - 2] == a && bolola2[bolola2.length - 1] == b) {
                isfound = true;
                break;
            }

        }
        System.out.println(isfound);
        System.out.println();


        char[] CharArray1 = {'b', 'a', 'b', 'o', 'b', 'a'};
        boolean isBob = false;
        for (int i = 0; i < CharArray1.length - 2; i++) {
            if (CharArray1[i] == 'b' && CharArray1[i + 2] == 'b') {
                isBob = true;
                break;
            }

        }
        System.out.println(isBob);
        System.out.println();

        char[] text = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' ', ' '};

        int startIndex = 0;
        int endIndex = text.length - 1;
        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] resalt = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            resalt[index++] = text[i];

        }
        for (int i = 0; i < resalt.length; i++) {
            System.out.print(resalt[i]);

        }
    }
}
