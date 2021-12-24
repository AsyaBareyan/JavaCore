package chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        //poluchit poryadkovie znach s pomoshyu metoda ordinal()
        System.out.println("vse constanti sortov yablok " + " poryadkovoe znach");
        for (Apple a : Apple.values()) {
            System.out.println(a + " " + a.ordinal());}

            ap = Apple.RED_DEL;
            ap2 = Apple.GOLDEN_DEL;
            ap3 = Apple.RED_DEL;
            System.out.println();


        //metodi compareTo() i equals()
        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " predshestvuet " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " predshestvuet " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " ravno " + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)) {
            System.out.println(" oshibka! ");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " ravno " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }

    }
}

