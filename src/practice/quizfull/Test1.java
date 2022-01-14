package practice.quizfull;

public class Test1 extends G{
    public int i=1;

    public static void main(String... args) {
        System.out.print(new Test1().i);
        System.out.print(new G().i);
        System.out.print( ((G)new Test1()).i );
    }
}
class G{
    public int i=2;
}