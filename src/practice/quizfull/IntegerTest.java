package practice.quizfull;

public class IntegerTest {
    public static void main(String[] args) {
        Integer i1=new Integer("1");
        Integer i2=new Integer("2");
        Integer i3=Integer.valueOf("3");
        int i4=i1+i2+i3;
        System.out.println(i4);
    }
}
