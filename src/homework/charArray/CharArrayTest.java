package homework.charArray;

public class CharArrayTest {
    public static void main(String[] args) {
        char[] chars = {' ',' ','b', 'o', 'l', 'o', 'l', 'a',' ',' '};
        CharArray charsTest=new CharArray();
        charsTest.count(chars,'b');
        charsTest.print(chars);
        charsTest.simvol(chars,'a','b');
        charsTest.simvolTwo(chars,'l');
      // char charBarev= charsTest.charBarev(chars,' ');
       // System.out.println(charBarev);
        charsTest.charBarev(chars,' ');
    }
}
