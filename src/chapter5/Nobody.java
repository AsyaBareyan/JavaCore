package chapter5;

public class Nobody {
    public static void main(String[] args) {
        int i, j;
        i=100;
        j=200;
        while (++i<--j);
        System.out.println("сред зн равно " + i);
    }
}
