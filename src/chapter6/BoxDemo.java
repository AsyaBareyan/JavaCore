package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10, 20, 15);
//        mybox1.width=10;
//        mybox1.height=20;
//        mybox1.depth=15;
        vol = mybox1.volume();
        System.out.println("mybox1.Объем равен " + vol);

//        mybox2.width=3;
//        mybox2.height=6;
//        mybox2.depth=9;
        mybox2.setDim(3, 6, 9);
        vol = mybox2.volume();
        System.out.println("mybox2.Объем равен " + vol);
    }
}
