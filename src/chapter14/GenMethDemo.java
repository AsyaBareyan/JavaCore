package chapter14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++)
            if (x.equals(y[i])) {
                return true;

            }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("2 soderjitsya v massive nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("7 ne soderjitsya v massive nums");
        }
        System.out.println();
        String[] strs = {"odin", "dva", "tri"};
        if (isIn("odin", strs)) {
            System.out.println("odin soderjitsya v massive strs");
        }
        if (!isIn("sem", strs)) {
            System.out.println("sem ne soderjitsya v massive strs");
        }

    }
}
