package homework.charArray;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] chars = {' ', ' ', 'b', 'o', 'l', 'o', 'l', 'a', ' ', ' '};
        CharArray charArray = new CharArray();
        charArray.count(chars, 'b');
        charArray.print(chars);
        charArray.simvol(chars, 'a', 'b');
        charArray.simvolTwo(chars, 'l');
     char[] result=charArray.trim(chars);
        for (char c : result) {
            System.out.print(c);

        }
    }
}
