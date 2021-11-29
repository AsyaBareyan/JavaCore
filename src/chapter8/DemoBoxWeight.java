package chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("mybox1: " + vol);
        System.out.println("mybox1 ves: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("mybox: " + vol);
        System.out.println("mybox2 ves: " + mybox2.weight);
    }
}
