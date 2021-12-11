package chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d=0;
            a=42/d;
            System.out.println("Eto ne budet vivedeno");

        }catch (ArithmeticException e){
            System.out.println("delenie na 0");
        }
        System.out.println("posle operatora catch");
    }
}
