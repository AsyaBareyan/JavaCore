package homework.arrayUtil1;

public class ArrayUtil {
    void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void evenNum(int[] array) {
        int evenNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                evenNum = array[i];
                System.out.print(evenNum+" ");
            }
        }
        System.out.println();
    }
    void oddNum(int[]array){
        int oddNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                oddNum = array[i];
                System.out.print(oddNum+" ");
            }
        }
        System.out.println();
    }
    int count (int[]array){
        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }
    int count1 (int[]array){
        int oddNum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                oddNum++;
            }
        }
        return oddNum;
    }
    void mijTv(int[]array){
        float sum = 0;
        float mijTvab = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mijTvab = sum / array.length;
        }
        System.out.println(mijTvab);
    }
    void sort(int[] array){
        for (int i = 0; i < array.length-i; i++)
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

}