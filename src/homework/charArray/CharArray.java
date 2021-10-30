package homework.charArray;

public class CharArray {
    int count(char[] chars, char c) {

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }

        }
        System.out.println("count of " + "'" + c + "'" + " = " + count);
        System.out.println();
        return count;
    }

    void print(char[] chars) {
        System.out.println(chars[chars.length / 2 - 1] + " " + chars[chars.length / 2]);
        System.out.println();
    }

    void simvol(char[] chars, char m, char n) {
        char a = m;
        char b = n;
        boolean isfound = false;
        for (char x : chars) {
            if (chars[chars.length - 2] == a && chars[chars.length - 1] == b) {
                isfound = true;
                break;
            }

        }
        System.out.println(isfound);
        System.out.println();

    }

    void simvolTwo(char[] chars, char d) {
        boolean isBob = false;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == d && chars[i + 2] == d) {
                isBob = true;
                break;
            }

        }
        System.out.println(isBob);
        System.out.println();
    }

    void charBarev(char[] chars, char f) {
        int startIndex = 0;
        int endIndex = chars.length - 1;
        while (startIndex < endIndex && chars[startIndex] == f) {
            startIndex++;
        }
        while (startIndex < endIndex && chars[endIndex] == f) {
            endIndex--;
        }
        char[] resalt = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            resalt[index++] = chars[i];

        }
        for (int i = 0; i < resalt.length; i++) {
            System.out.print(resalt[i]);


        }
        //return resalt[i];  }
    }
}
