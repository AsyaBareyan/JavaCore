package homework.practiceHomework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        return 365 * years;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameName(int a, int b) {
        if (a == b) {
            return true;
        }
        return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else return false;
    }

    boolean reverseBool(boolean value) {
        if (value == false) {
            return true;
        } else return false;
    }

    int maxLenght(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;

    }
}
