package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
//        for (int i = 0; i < 10; i++) {
//            da.add(i+1);
//
//        }
        System.out.println(da.isEmpty());

        da.delete(4);
        int[] numbers={33,44,55};
        da.add(numbers);
        System.out.println(da.isEmpty());
        da.print();
        da.add(66,2);
        System.out.println(da.isExists(55));


    }
}
