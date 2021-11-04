package homework.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(8);
        da.add(7);
        da.add(6);
        da.add(10);
        da.add(1);
        da.add(55);
        da.add(20);
        da.add(18);
        da.add(81);
        da.add(80);
        System.out.println(da.getByIndex(21));
        da.print();


    }
}
