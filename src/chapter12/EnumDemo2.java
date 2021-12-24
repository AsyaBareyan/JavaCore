package chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("constanti perechisl. tipa Apple:");
        Apple allApples[]=Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);}
            System.out.println();

            ap=Apple.valueOf("WINESAP");
            System.out.println("peremennya ap soderjit "+ap);

    }
}
