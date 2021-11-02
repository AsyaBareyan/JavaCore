package homework.practiceHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.calcAge(2));
        System.out.println(practiceHomework.nextNumber(14));
        System.out.println(practiceHomework.convert(10));
        System.out.println(practiceHomework.isSameName(14, 17));
        System.out.println(practiceHomework.lessThanOrEqualToZero(0));
        System.out.println(practiceHomework.reverseBool(false));
        int[] arrray1 = {1, 11, 2020,4,};
        int[] array2 = {14, 17, 1992, -1,88};
        System.out.println(practiceHomework.maxLenght(arrray1, array2));

    }
}
