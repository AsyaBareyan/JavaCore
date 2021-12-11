package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hell[o] from [java}";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
