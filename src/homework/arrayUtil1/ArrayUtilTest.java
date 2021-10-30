package homework.arrayUtil1;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {14, 11, 92, 1, 11, 17, -4, 8, 9, 30};
        arrayUtil.print(array);
        int arrayMax = arrayUtil.max(array);
        System.out.println("Տպել մասիվի ամենամեծ էլեմենտը: max=" + arrayMax);
        int arrayMin = arrayUtil.min(array);
        System.out.println("Տպել մասիվի ամենափոքր էլեմենտը: min=" + arrayMin);
        arrayUtil.evenNum(array);
        arrayUtil.oddNum(array);
        int count = arrayUtil.count(array);
        System.out.println(count);
        int count1 = arrayUtil.count1(array);
        System.out.println(count1);
        arrayUtil.mijTv(array);
        arrayUtil.sort(array);
    }
}
