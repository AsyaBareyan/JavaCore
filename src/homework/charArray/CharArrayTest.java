package homework.charArray;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] chars = {' ', ' ', 'b', 'o', 'l', 'o', 'l', 'a', ' ', ' '};
        CharArray charsTest = new CharArray();
        charsTest.count(chars, 'b');
        charsTest.print(chars);
        charsTest.simvol(chars, 'a', 'b');
        charsTest.simvolTwo(chars, 'l');
     char[] result=charsTest.trim(chars);
        for (char c : result) {
            System.out.print(c);

        }
    }
}
