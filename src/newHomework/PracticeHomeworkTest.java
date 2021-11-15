package newHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
    PracticeHomework ph= new PracticeHomework();
        System.out.println(ph.convert(1));
        System.out.println(ph.calcAge(1));
        System.out.println(ph.isSameNum(5,6));
        System.out.println(ph.nextNumber(4));
        System.out.println(ph.lessThanOrEqualToZero(10));
        System.out.println(ph.reverseBool(true));

        int[]array1={1,2,3};
        int[]array2={4,5,6,7,8};
        System.out.println(ph.maxLenght(array1, array2));
    }}
