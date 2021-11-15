package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
//        for (int i = 0; i < 10; i++) {
//            da.add(i+1);
//
//        }da.print();
        System.out.println(da.isEmpty());
        da.add(5);
        System.out.println(da.isEmpty());
        int[] numbers={33,44,55};
        da.add(numbers);
        da.delete(4);
        da.print();
        da.add(66,2);
        da.set(10,3);
        System.out.println(da.isExists(33));


    }
}
