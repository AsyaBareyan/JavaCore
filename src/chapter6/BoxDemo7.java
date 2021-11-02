package chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println("Объем myBox1= " + vol);
        vol = myBox2.volume();
        System.out.println("Объем myBox2= " + vol);

    }

}
